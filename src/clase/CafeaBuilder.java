package clase;

public class CafeaBuilder implements Bautura{
    private String nume;
    private double pret;
    private double volum;
    private String baza;
    private String toppinguri;

    public CafeaBuilder(String nume) {
        this.nume = nume;
        this.pret = 10.20;
        this.baza = "Lapte";
        this.volum = 20.50;
        this.toppinguri = "Caramel si cacao";
    }

    public CafeaBuilder setVolum(double volum) {
        this.volum = volum;
        return this;
    }

    public CafeaBuilder setPret(double pret) {
        this.pret = pret;
        return this;
    }

    public CafeaBuilder setBaza(String baza) {
        this.baza = baza;
        return this;
    }

    public CafeaBuilder setToppinguri(String toppinguri) {
        this.toppinguri = toppinguri;
        return this;
    }

    public Cafea build(){
        return new Cafea(nume, pret, baza, volum, toppinguri);
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public double getVolum() {
        return this.volum;
    }

    @Override
    public String getBaza() {
        return this.baza;
    }

    @Override
    public String getToppinguri() {
        return this.toppinguri;
    }
}
