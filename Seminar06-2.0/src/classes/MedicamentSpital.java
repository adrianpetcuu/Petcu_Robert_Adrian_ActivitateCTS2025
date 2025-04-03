package classes;

public class MedicamentSpital {
    private float pret;
    private String nume;

    public MedicamentSpital(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println((new StringBuilder(" si a fost achizitionat la pretul de ").append(this.pret)).toString());
    }

    public void prezintaReteta(){
        System.out.println((new StringBuilder("Este prezentata reteta pentru medicamentul ").append(this.nume)).toString());
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }
}
