package exemplul2.program;

import exemplul2.clase.Comanda;
import exemplul2.clase.Facade;

public class Program {
    public static void main(String[] args) {
        Facade facade = new Facade();

        Comanda comanda1 = new Comanda("Pizza Margherita", 2);
        Comanda comanda2 = new Comanda("Burger dublu", 8);

        facade.plaseazaComanda(comanda1);
        facade.plaseazaComanda(comanda2);
    }
}
