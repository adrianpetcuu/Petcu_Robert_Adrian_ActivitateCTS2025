package exemplul3.decorator;

import exemplul3.clase.IComanda;

public class DecoratorAmbalajEco extends ComandaDecorator{
    public DecoratorAmbalajEco(IComanda comanda) {
        super(comanda);
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println(" + Ambalaj eco adaugat.");
    }

    @Override
    public double getCostTotal() {
        return super.getCostTotal() + 5;
    }

    @Override
    public int getTimpEstimativ() {
        return super.getTimpEstimativ();
    }

    @Override
    public void anuntaOptiunea() {
        System.out.println("Optiune selectata: Ambalaj eco.");
    }
}
