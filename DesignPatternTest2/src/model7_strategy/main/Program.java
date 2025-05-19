package model7_strategy.main;

import model7_strategy.model.Client;
import model7_strategy.model.Produs;
import model7_strategy.model.StrategieImplicita;
import model7_strategy.model.StrategieInteractiva;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Produs> produse = new ArrayList<>();
        produse.add(new Produs("Nike Air", "negru", 350, "42"));
        produse.add(new Produs("Adidas Ultra", "alb", 300, "43"));
        produse.add(new Produs("Puma Sport", "negru", 290, "42"));
        produse.add(new Produs("Reebok Classic", "rosu", 270, "41"));

        Client client = new Client("Popescu");

        client.setStrategie(new StrategieImplicita());
        List<Produs> rezultate1 = client.cautaProduse(produse);
        System.out.println("Rezultate pentru cautare implicita: ");
        rezultate1.forEach(System.out::println);

        client.setStrategie(new StrategieInteractiva());
        List<Produs> rezultate2 = client.cautaProduse(produse);
        System.out.println("\nRezultate pentru cautare interactiva: ");
        rezultate2.forEach(System.out::println);
    }
}
