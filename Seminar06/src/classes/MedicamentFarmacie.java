package classes;

public class MedicamentFarmacie {
    private float pret;
    private String nume;
    private boolean esteInStoc;

    public MedicamentFarmacie(float pret, String nume, boolean esteInStoc) {
        this.pret = pret;
        this.nume = nume;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        if(esteInStoc){
            System.out.println("Medicamentul " + this.nume + " a fost achizitionat la pretul de " + this.pret + " lei.");
        }
        else {
            System.out.println("Medicamentul " + this.nume + " nu este in stoc.");
        }
    }
}
