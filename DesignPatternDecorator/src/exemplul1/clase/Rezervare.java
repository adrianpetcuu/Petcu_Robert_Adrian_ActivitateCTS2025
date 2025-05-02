package exemplul1.clase;

import java.time.LocalDateTime;

public class Rezervare implements IRezervare{
    private String numeClient;
    private int numarPersoane;
    private LocalDateTime dataOra;
    private double pretBaza;

    public Rezervare(String numeClient, int numarPersoane, LocalDateTime dataOra, double pretBaza) {
        this.numeClient = numeClient;
        this.numarPersoane = numarPersoane;
        this.dataOra = dataOra;
        this.pretBaza = pretBaza;
    }

    @Override
    public void descriere() {
        System.out.println("Rezervare pentru: " + numeClient +
                ", persoane: " + numarPersoane +
                ", data si ora: " + dataOra +
                ", pret de baza: " + pretBaza + " lei.");
    }

    @Override
    public double getPret() {
        return pretBaza;
    }
}
