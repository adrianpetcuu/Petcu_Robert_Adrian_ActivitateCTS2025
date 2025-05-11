package exemplul4.program;

import exemplul4.clase.Document;
import exemplul4.clase.ElementDocument;
import exemplul4.clase.Paragraf;
import exemplul4.clase.Sectiune;

public class Program {
    public static void main(String[] args) {
        ElementDocument intro = new Paragraf("Acesta este un document despre Java.");
        ElementDocument concluzie = new Paragraf("Acesta este sfarsitul documentului.");

        ElementDocument capitol1 = new Sectiune("Capitolul 1 - Bazele Java");
        try {
            capitol1.adaugaNod(new Paragraf("Java este un limbaj orientat pe obiect."));
            capitol1.adaugaNod(new Paragraf("Clasele sunt sabloane pentru obiecte."));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ElementDocument capitol2 = new Sectiune("Capitol 2 - Avansat");
        try {
            capitol2.adaugaNod(new Paragraf("Interfetele definesc contracte."));
            capitol2.adaugaNod(new Paragraf("Design pattern ajuta la structura codului."));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ElementDocument capitol2_1 = new Sectiune("2.1 Composite Pattern");
        try {
            capitol2_1.adaugaNod(new Paragraf("Permite structurarea ierarhica a obiectelor."));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            capitol2.adaugaNod(capitol2_1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ElementDocument document = new Document("Carte Java");
        try {
            document.adaugaNod(intro);
            document.adaugaNod(capitol1);
            document.adaugaNod(capitol2);
            document.adaugaNod(concluzie);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        document.afiseaza(0);
    }
}
