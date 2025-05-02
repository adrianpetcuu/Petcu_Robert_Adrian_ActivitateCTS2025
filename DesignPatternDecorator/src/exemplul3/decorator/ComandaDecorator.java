package exemplul3.decorator;

import exemplul3.clase.IComanda;

public abstract class ComandaDecorator implements IComanda {
    protected IComanda comanda;

    public ComandaDecorator(IComanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public void descriere() {
        comanda.descriere();
    }

    @Override
    public double getCostTotal() {
        return comanda.getCostTotal();
    }

    @Override
    public int getTimpEstimativ() {
        return comanda.getTimpEstimativ();
    }

    //metoda abstracta pentru ca decoratorii sa afiseze un mesaj specific
    public abstract void anuntaOptiunea();
}
