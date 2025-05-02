package exemplul4.decorator;


import exemplul4.clase.INota;

public class DesertGratuitDecorator extends DecoratorNota{
    public DesertGratuitDecorator(INota nota) {
        super(nota);
    }

    @Override
    public void aplicaBeneficiu() {
        System.out.println("Ati primit un desert gratuit!");
    }
}
