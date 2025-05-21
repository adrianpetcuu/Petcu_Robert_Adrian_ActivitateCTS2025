package Decorator.main;

import Decorator.model.*;

public class Program {
    public static void main(String[] args) {
        Bautura comanda1 = new Espresso();
        comanda1 = new Lapte(comanda1);
        comanda1 = new SiropCiocolata(comanda1);

        System.out.println("Comanda 1: " + comanda1.getDescriere());
        System.out.println("Pret total: " + comanda1.getPret() + " RON");

        Bautura comanda2 = new CeaiVerde();
        comanda2 = new Gheata(comanda2);

        System.out.println("\nComanda 2: " + comanda2.getDescriere());
        System.out.println("Pret total: " + comanda2.getPret() + " RON");
    }
}
