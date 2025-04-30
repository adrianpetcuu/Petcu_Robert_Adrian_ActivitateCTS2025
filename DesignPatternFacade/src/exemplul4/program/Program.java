package exemplul4.program;

import exemplul4.clase.Facade;
import exemplul4.clase.ICalculator;

public class Program {
    public static void main(String[] args) {
        ICalculator facade = new Facade();

        System.out.println("5 + 3 = " + facade.adunare(5, 3));
        System.out.println("10 - 4 = " + facade.scadere(10, 4));
        System.out.println("6 * 2 = " + facade.inmultire(6, 2));
        System.out.println("20 / 5 = " + facade.impartire(20, 5));
    }
}
