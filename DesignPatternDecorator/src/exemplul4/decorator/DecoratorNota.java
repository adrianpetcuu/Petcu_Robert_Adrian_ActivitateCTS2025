package exemplul4.decorator;

import exemplul4.clase.INota;

public abstract class DecoratorNota implements INota {
    protected INota nota;

    public DecoratorNota(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaNota() {
        nota.printeazaNota();
        System.out.println("Va multumim pentru vizita!");
    }

    @Override
    public double getTotal() {
        return nota.getTotal();
    }

    //metoda abstracta - forteaza decoratorii concreti sa aplice un beneficiu
    public abstract void aplicaBeneficiu();
}
