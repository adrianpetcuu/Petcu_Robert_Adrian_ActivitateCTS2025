package clase;

public class Cafea {
    private String nume;
    private double pret;
    private double volum;
    private String baza;
    private String toppinguri;

    protected Cafea(String nume, double pret, String baza, double volum, String toppinguri) {
        this.nume = nume;
        this.pret = pret;
        this.baza = baza;
        this.volum = volum;
        this.toppinguri = toppinguri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", volum=").append(volum);
        sb.append(", baza='").append(baza).append('\'');
        sb.append(", toppinguri='").append(toppinguri).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
