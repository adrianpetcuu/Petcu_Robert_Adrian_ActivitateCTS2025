package exemplul1.decorator;

import exemplul1.clase.IRezervare;

public class MuzicaDecorator extends Decorator{
    public MuzicaDecorator(IRezervare rezervare) {
        super(rezervare);
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println(" + Muzica personalizata.");
    }

    @Override
    public double getPret() {
        return super.getPret() + 30;
    }
}
