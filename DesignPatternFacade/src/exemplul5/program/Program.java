package exemplul5.program;

import exemplul5.clase.Facade;
import exemplul5.clase.ICalculator;

public class Program {
    public static void main(String[] args) {
        ICalculator facade = new Facade();
        facade.pornesteCalculator();
        System.out.println("------------------");
        facade.opresteCalculator();
    }
}
