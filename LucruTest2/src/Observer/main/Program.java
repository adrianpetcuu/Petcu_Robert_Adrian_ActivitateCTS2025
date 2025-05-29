package Observer.main;

import Observer.model.Client;
import Observer.model.Produs;

public class Program {
    public static void main(String[] args) {
        Produs laptop = new Produs("Laptop ASUS", 2);
        Client c1 = new Client("Andrei");
        Client c2 = new Client("Maria");

        laptop.adaugaObserver(c1);
        laptop.adaugaObserver(c2);

        laptop.vinde(2);

        laptop.alimenteaza(5);
    }
}
