package classes;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(iMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia " + this.nume + " va ofera medicamentul:");
        medicamentFarmacie.cumparaMedicament();
    }
}
