package main;

import classes.AdaptorMedicament;
import classes.MedicamentFarmacie;
import classes.MedicamentSpital;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia nostra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100, "Parasinus", true);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie(35, "Nurofen", true);
        vindeMedicament(medicamentFarmacie);
        vindeMedicament(medicamentFarmacie1);

        MedicamentSpital medicamentSpital = new MedicamentSpital(100, "Antibiotic 1");
        MedicamentSpital medicamentSpital1 = new MedicamentSpital(95, "Antibiotic 2");
        //nu putem folosi vindeMedicament si avem nevoie de adapter
        //vindeMedicament(medicamentSpital);
        //ADAPTOR OBIECTE
        vindeMedicament(new AdaptorMedicament(medicamentSpital));
        vindeMedicament(new AdaptorMedicament(medicamentSpital1));
    }
}