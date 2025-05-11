package exemplul3.program;

import exemplul3.clase.Categorie;
import exemplul3.clase.Produs;
import exemplul3.clase.StructuraSite;

public class Program {
    public static void main(String[] args) {
        StructuraSite iphone = new Produs("iPhone 15", 4999.99);
        StructuraSite galaxy = new Produs("Samsung Galaxy S24", 3999.99);

        StructuraSite dell = new Produs("Dell XPS 13", 7999.99);
        StructuraSite lenovo = new Produs("Lenovo Legion", 7299.99);

        StructuraSite casti = new Produs("AirPods Pro", 999.99);


        //subcategorii
        StructuraSite telefoane = new Categorie("Telefoane");
        StructuraSite laptopuri = new Categorie("Laptopuri");
        StructuraSite accesorii = new Categorie("Accesorii");

        StructuraSite electronice = new Categorie("Electronice");

        try {
            telefoane.adaugaNod(iphone);
            telefoane.adaugaNod(galaxy);
            laptopuri.adaugaNod(dell);
            laptopuri.adaugaNod(lenovo);
            accesorii.adaugaNod(casti);

            electronice.adaugaNod(telefoane);
            electronice.adaugaNod(laptopuri);
            electronice.adaugaNod(accesorii);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        electronice.afiseaza(0);
    }
}
