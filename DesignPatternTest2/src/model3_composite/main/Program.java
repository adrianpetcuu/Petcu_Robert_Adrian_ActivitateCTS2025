package model3_composite.main;

import model3_composite.model.Categorie;
import model3_composite.model.IProdus;
import model3_composite.model.Produs;

public class Program {
    public static void main(String[] args) {
        IProdus categorie = new Categorie("Magazin");

        IProdus subCategorie1 = new Categorie("Electronice");
        IProdus subCategorie2 = new Categorie("Casnice");
        IProdus subCategorie3 = new Categorie("Imbracaminte");

        IProdus produs1 = new Produs("Iphone 16", 5);
        IProdus produs2 = new Produs("Samsung S25", 6);
        IProdus produs3 = new Produs("Masina de spalat", 3);
        IProdus produs4 = new Produs("Cuptor microunde", 6);
        IProdus produs5 = new Produs("Camasa", 10);
        IProdus produs6 = new Produs("Blugi", 4);

        try {
            ((Categorie) subCategorie1).adaugaProdus(produs1);
            ((Categorie) subCategorie1).adaugaProdus(produs2);
            ((Categorie) subCategorie2).adaugaProdus(produs3);
            ((Categorie) subCategorie2).adaugaProdus(produs4);
            ((Categorie) subCategorie3).adaugaProdus(produs5);
            ((Categorie) subCategorie3).adaugaProdus(produs6);

            ((Categorie) categorie).adaugaProdus(subCategorie1);
            ((Categorie) categorie).adaugaProdus(subCategorie2);
            ((Categorie) categorie).adaugaProdus(subCategorie3);

            categorie.afiseaza();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
