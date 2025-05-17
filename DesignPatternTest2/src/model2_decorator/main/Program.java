package model2_decorator.main;

import model2_decorator.model.IMagazin;
import model2_decorator.model.Magazin;
import model2_decorator.model.PrimaComandaDecorator;

public class Program {
    public static void main(String[] args) {
        IMagazin magazinStandard = new Magazin();
        IMagazin magazinPrimaComanda = new PrimaComandaDecorator(magazinStandard);

        String client1 = "c1";
        String client2 = "c2";

        System.out.println("--- Comenzi client 1 ---");
        System.out.println("Comanda 1: Total = " + magazinPrimaComanda.calculeazaTotal(client1, 100));
        System.out.println("Comanda 2: Total = " + magazinPrimaComanda.calculeazaTotal(client1, 150));

        System.out.println("--- Comenzi client 2 ---");
        System.out.println("Comanda 1: Total = " + magazinPrimaComanda.calculeazaTotal(client2, 200));
        System.out.println("Comanda 2: Total = " + magazinPrimaComanda.calculeazaTotal(client2, 80));
    }
}
