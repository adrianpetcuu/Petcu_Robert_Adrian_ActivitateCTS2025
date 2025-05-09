package exemplul3.program;

import exemplul3.clase.FabricaSoldati;
import exemplul3.clase.ISoldat;
import exemplul3.clase.SoldatExtrinsec;

public class Program {
    public static void main(String[] args) {

        FabricaSoldati fabricaSoldati = new FabricaSoldati();

        ISoldat infanterist = fabricaSoldati.getSoldat("Infanterist");
        ISoldat lunetist = fabricaSoldati.getSoldat("Lunetist");

        infanterist.afiseaza(new SoldatExtrinsec("Popescu", 10, 20));
        infanterist.afiseaza(new SoldatExtrinsec("Ionescu", 15, 25));
        lunetist.afiseaza(new SoldatExtrinsec("Sniper", 30, 40));

        System.out.println("Numar tipuri soldati create: " + fabricaSoldati.getNumarTipuriSoldati() + ".");
    }
}
