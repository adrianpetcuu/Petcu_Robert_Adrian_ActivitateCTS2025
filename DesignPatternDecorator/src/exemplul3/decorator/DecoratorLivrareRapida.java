package exemplul3.decorator;

import exemplul3.clase.IComanda;

public class DecoratorLivrareRapida extends ComandaDecorator{

    public DecoratorLivrareRapida(IComanda comanda) {
        super(comanda);
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println(" + Livrare rapida adaugata.");
    }

    @Override
    public double getCostTotal() {
        return super.getCostTotal() + 15;
    }

    @Override
    public int getTimpEstimativ() {
        return Math.max(10, super.getTimpEstimativ() - 20);
    }

    @Override
    public void anuntaOptiunea() {
        System.out.println("Optiune selectata: Livrare rapida.");
    }
}
