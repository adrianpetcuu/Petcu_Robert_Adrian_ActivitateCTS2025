package ro.ase.pregatire.clase;

public class BmwM3 extends Masina {
    private String model;
    private int caiPutere;

    public BmwM3(String marca, double pret, String model, int caiPutere) {
        super(marca, pret);
        this.model = model;
        this.caiPutere = caiPutere;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Aceasta masina este un " + getMarca() + " " + model + ", are " + caiPutere + " cai putere si este listata la pretul de " + getPret() + " euro.");
    }
}

