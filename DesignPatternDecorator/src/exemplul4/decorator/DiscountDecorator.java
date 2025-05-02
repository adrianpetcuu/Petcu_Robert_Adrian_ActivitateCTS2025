package exemplul4.decorator;

import exemplul4.clase.INota;
import exemplul4.clase.NotaDePlata;

public class DiscountDecorator extends DecoratorNota{
    private int procent;

    public DiscountDecorator(INota nota, int procent) {
        super(nota);
        this.procent = procent;
    }

    @Override
    public void aplicaBeneficiu() {
        double discount = nota.getTotal() * procent / 100;
        ((NotaDePlata)nota).setTotal(nota.getTotal() - discount);
        System.out.println("S-a aplicat un discount de " + procent + "%.");
    }
}
