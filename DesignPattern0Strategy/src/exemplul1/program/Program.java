package exemplul1.program;

import exemplul1.clase.Produs;
import exemplul1.strategy.Comanda;
import exemplul1.strategy.LivrareEco;
import exemplul1.strategy.LivrareRapida;
import exemplul1.strategy.LivrareStandard;

public class Program {
    public static void main(String[] args) {
        Comanda comanda = new Comanda("Ioana", "Str. Libertatii 14", new LivrareStandard());
        comanda.adaugaProdus(new Produs("Pizza Margherita", 25));
        comanda.adaugaProdus(new Produs("Cola 0.5L", 6));

        System.out.println("=== COMANDA INITIALA ===");
        comanda.afiseazaDetalii();

        System.out.println("\n=== MODIFIC LIVRAREA LA RAPIDA ===");
        comanda.setModLivrare(new LivrareRapida());
        comanda.afiseazaDetalii();

        System.out.println("\n=== MODIFIC LIVRAREA LA ECO ===");
        comanda.setModLivrare(new LivrareEco());
        comanda.afiseazaDetalii();
    }
}