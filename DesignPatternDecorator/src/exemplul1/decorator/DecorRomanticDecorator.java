package exemplul1.decorator;

import exemplul1.clase.IRezervare;

public class DecorRomanticDecorator extends Decorator{

    public DecorRomanticDecorator(IRezervare rezervare) {
        super(rezervare);
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println(" + Decor romantic.");
    }

    @Override
    public double getPret() {
        return super.getPret() + 20;
    }
}
