package exemplul5.program;

import exemplul5.clase.CalculCASCO;
import exemplul5.clase.CalculPremium;
import exemplul5.clase.CalculRCA;
import exemplul5.clase.PolitaAsigurare;

public class Program {
    public static void main(String[] args) {
        PolitaAsigurare politaAsigurare = new PolitaAsigurare("Ion Popescu", 23,
                1600, 25000, 2, "urban", new CalculRCA());

        politaAsigurare.afiseazaDetalii();

        System.out.println("\n => Schimbare in CASCO:");
        politaAsigurare.setStrategieCalcul(new CalculCASCO());
        politaAsigurare.afiseazaDetalii();

        System.out.println("\n => Schimbare in PREMIUM:");
        politaAsigurare.setStrategieCalcul(new CalculPremium());
        politaAsigurare.afiseazaDetalii();
    }
}
