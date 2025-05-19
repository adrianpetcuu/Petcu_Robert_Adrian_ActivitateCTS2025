package model6_chainOfResponsability.model;

public class FiltruParametri {
    private String culoare;
    private double pretMax;
    private String marime;

    public FiltruParametri(String culoare, double pretMax, String marime){
        this.culoare = culoare;
        this.pretMax = pretMax;
        this.marime = marime;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPretMax() {
        return pretMax;
    }

    public String getMarime() {
        return marime;
    }
}
