package exemplul4.program;

import exemplul4.clase.INota;
import exemplul4.clase.NotaDePlata;
import exemplul4.decorator.DecoratorNota;
import exemplul4.decorator.DesertGratuitDecorator;
import exemplul4.decorator.DiscountDecorator;

public class Program {
    public static void main(String[] args) {
        INota nota = new NotaDePlata(5, 120);
        System.out.println("Nota standard: ");
        nota.printeazaNota();
        System.out.println("---------------------");

        INota notaDiscount = new DiscountDecorator(nota, 10);
        ((DiscountDecorator) notaDiscount).aplicaBeneficiu();
        notaDiscount.printeazaNota();
        System.out.println("Total cu discount: " + nota.getTotal() + " lei.");
        System.out.println("---------------------");

        INota notaDesertGratuit = new DesertGratuitDecorator(nota);
        ((DesertGratuitDecorator) notaDesertGratuit).aplicaBeneficiu();
        notaDesertGratuit.printeazaNota();
    }
}
