package model6_chainOfResponsability.main;

import model6_chainOfResponsability.model.FiltruParametri;
import model6_chainOfResponsability.model.Magazin;
import model6_chainOfResponsability.model.Produs;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Magazin magazin = new Magazin();

        magazin.adaugaProdus(new Produs("Adidas Runner", "alb", 250, "42"));
        magazin.adaugaProdus(new Produs("Nike Zoom", "negru", 400, "43"));
        magazin.adaugaProdus(new Produs("Reebok Sport", "rosu", 300, "41"));
        magazin.adaugaProdus(new Produs("Puma Classic", "alb", 150, "42"));
        magazin.adaugaProdus(new Produs("New Balance 574", "verde", 350, "44"));
        magazin.adaugaProdus(new Produs("Vans Old Skool", "negru", 270, "42"));
        magazin.adaugaProdus(new Produs("Fila Retro", "alb", 190, "41"));

        System.out.println("=== Căutare 1: alb, max 300 RON ===");
        List<Produs> rezultat1 = magazin.cauta(new FiltruParametri("alb", 300, null));
        rezultat1.forEach(System.out::println);

        System.out.println("\n=== Căutare 2: negru, max 500 RON, marime 42 ===");
        List<Produs> rezultat2 = magazin.cauta(new FiltruParametri("negru", 500, "42"));
        rezultat2.forEach(System.out::println);
    }
}
