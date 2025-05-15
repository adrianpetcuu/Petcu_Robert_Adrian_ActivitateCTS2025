package exemplul3.clase;

public class Tranzactie {
    private String titular;
    private double suma;
    private double soldDisponibil;
    private boolean tranzactieInternationala;
    private double totalZilnic;

    public Tranzactie(String titular, double suma, double soldDisponibil, boolean tranzactieInternationala, double totalZilnic) {
        this.titular = titular;
        this.suma = suma;
        this.soldDisponibil = soldDisponibil;
        this.tranzactieInternationala = tranzactieInternationala;
        this.totalZilnic = totalZilnic;
    }

    public String getTitular() {
        return titular;
    }

    public double getSuma() {
        return suma;
    }

    public double getSoldDisponibil() {
        return soldDisponibil;
    }

    public boolean isTranzactieInternationala() {
        return tranzactieInternationala;
    }

    public double getTotalZilnic() {
        return totalZilnic;
    }
}
