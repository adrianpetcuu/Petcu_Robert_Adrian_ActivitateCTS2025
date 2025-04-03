package main;

import classes.*;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        iMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100, "Paduden", true);
        farmacie.vindeMedicament(medicamentFarmacie);

        //MedicamentSpital medicamentSpital = new MedicamentSpital(19, "Nurofen");
        //farmacie.vindeMedicament(medicamentSpital); nu putem asa fara adaptor
        //ADAPTOR CLASE
        AdapterClaseMedicament adapterClaseMedicament = new AdapterClaseMedicament(19, "Nurofen");
        farmacie.vindeMedicament(adapterClaseMedicament);
    }
}