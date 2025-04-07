package program;

import clase.CursValutarEager;

public class MainCursValutar {
    public static void main(String[] args) {
        CursValutarEager cursValutar = CursValutarEager.getInstance();
        System.out.println(cursValutar.afiseazaCurs());

        cursValutar.actualizeazaCurs(4.97, 4.7, "2025-04-08");
        System.out.println(cursValutar.afiseazaCurs());

        System.out.println("Curs EUR: " + cursValutar.getCurs("EUR"));
        System.out.println("Curs USD: " + cursValutar.getCurs("USD"));
    }
}