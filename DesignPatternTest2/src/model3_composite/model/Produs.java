package model3_composite.model;

public class Produs implements IProdus, Composite{
    private String denumire;
    private int stoc;

    public Produs(String denumire, int stoc) {
        this.denumire = denumire;
        this.stoc = stoc;
    }

    @Override
    public void afiseaza() {
        System.out.println("Produs: " + denumire + " | Stoc: " + stoc);
    }

    @Override
    public int getNrProduse() {
        return 1;
    }

    @Override
    public void adaugaProdus(IProdus produs) throws Exception {
        throw new Exception("Nu este implementata aici.");
    }

    @Override
    public void stergeProdus(IProdus produs) throws Exception {
        throw new Exception("Nu este implementata aici.");
    }

    @Override
    public IProdus getNodCopil(int index) throws Exception {
        throw new Exception("Nu este implementata aici.");
    }
}
