package exemplul3.clase;

public class Client {
    private String nume;
    private boolean acteComplete;
    private boolean taxePlatite;

    public Client(String nume, boolean acteComplete, boolean taxePlatite) {
        this.nume = nume;
        this.acteComplete = acteComplete;
        this.taxePlatite = taxePlatite;
    }

    public String getNume() {
        return nume;
    }

    public boolean isActeComplete() {
        return acteComplete;
    }

    public boolean isTaxePlatite() {
        return taxePlatite;
    }
}
