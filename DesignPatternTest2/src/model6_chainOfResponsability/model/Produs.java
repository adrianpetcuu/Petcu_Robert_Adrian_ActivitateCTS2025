package model6_chainOfResponsability.model;

public class Produs {
    private String denumire;
    private String culoare;
    private double pret;
    private String marime;

    public Produs(String denumire, String culoare, double pret, String marime) {
        this.denumire = denumire;
        this.culoare = culoare;
        this.pret = pret;
        this.marime = marime;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPret() {
        return pret;
    }

    public String getMarime() {
        return marime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", marime='").append(marime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
