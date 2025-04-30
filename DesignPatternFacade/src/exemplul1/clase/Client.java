package exemplul1.clase;

public class Client {
    private String nume;
    private Bilet bilet;

    public Client(String nume, Bilet bilet){
        this.nume = nume;
        this.bilet = bilet;
    }

    public String getNume() {
        return nume;
    }

    public Bilet getBilet() {
        return bilet;
    }
}
