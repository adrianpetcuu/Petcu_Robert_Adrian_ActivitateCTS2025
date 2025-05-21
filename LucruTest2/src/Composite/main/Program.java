package Composite.main;

import Composite.model.Fisier;
import Composite.model.Folder;

public class Program {
    public static void main(String[] args) {
        // Fișiere individuale
        Fisier fisier1 = new Fisier("document.txt", 50);
        Fisier fisier2 = new Fisier("poza.jpg", 1500);
        Fisier fisier3 = new Fisier("prezentare.ppt", 3000);

        // Foldere
        Folder folderPoze = new Folder("Poze");
        folderPoze.adaugaNod(fisier2);

        Folder folderDocumente = new Folder("Documente");
        folderDocumente.adaugaNod(fisier1);
        folderDocumente.adaugaNod(fisier3);

        Folder folderRadacina = new Folder("Radacina");
        folderRadacina.adaugaNod(folderPoze);
        folderRadacina.adaugaNod(folderDocumente);

        // Afișare
        folderRadacina.afiseaza("");
    }
}
