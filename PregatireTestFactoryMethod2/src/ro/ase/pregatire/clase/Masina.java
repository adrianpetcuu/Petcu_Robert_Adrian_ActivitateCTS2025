package ro.ase.pregatire.clase;

public abstract class Masina {
    private String marca;
    private double pret;

    public Masina(String marca, double pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public double getPret() {
        return pret;
    }

    public abstract void afiseazaDetalii();
}
