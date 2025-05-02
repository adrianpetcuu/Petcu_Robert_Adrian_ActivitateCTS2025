package exemplul1.decorator;

import exemplul1.clase.IRezervare;

public class GeamDecorator extends Decorator{
    public GeamDecorator(IRezervare rezervare) {
        super(rezervare);
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println(" + Asezare la geam.");
    }

    @Override
    public double getPret() {
        return super.getPret() + 10;
    }
}
