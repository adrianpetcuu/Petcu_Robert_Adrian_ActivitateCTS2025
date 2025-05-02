package exemplul2.decorator;

import exemplul2.clase.IAbonament;

public class Streaming4KDecorator extends DecoratorAbonament{

    public Streaming4KDecorator(IAbonament abonament) {
        super(abonament);
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println(" + Include Streaming 4K.");
    }

    @Override
    public double getPret() {
        return super.getPret() + 15;
    }

    @Override
    public void anuntaOptiunea() {
        System.out.println("Ati adaugat optiunea: Streaming 4K.");
    }
}
