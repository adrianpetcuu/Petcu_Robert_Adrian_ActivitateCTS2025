package exemplul3.clase;

public class Comanda implements IComanda{
    private String numeClient;
    private double costBaza;
    private int timpLivrare;

    public Comanda(String numeClient, double costBaza, int timpLivrare) {
        this.numeClient = numeClient;
        this.costBaza = costBaza;
        this.timpLivrare = timpLivrare;
    }

    @Override
    public void descriere() {
        System.out.println("Comanda pentru: " + numeClient + ", cost baza: " + costBaza + " lei, timp estimativ: " + timpLivrare + " minute.");
    }

    @Override
    public double getCostTotal() {
        return costBaza;
    }

    @Override
    public int getTimpEstimativ() {
        return timpLivrare;
    }
}
