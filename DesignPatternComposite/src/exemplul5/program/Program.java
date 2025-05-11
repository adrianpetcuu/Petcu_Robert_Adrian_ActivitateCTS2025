package exemplul5.program;

import exemplul5.clase.ElementFisier;
import exemplul5.clase.Fisier;
import exemplul5.clase.Folder;

public class Program {
    public static void main(String[] args) {
        ElementFisier fisier1 = new Fisier("contract.pdf", 120);
        ElementFisier fisier2 = new Fisier("factura.docx", 90);
        ElementFisier fisier3 = new Fisier("poza.png", 340);

        ElementFisier documente = new Folder("Documente");
        ElementFisier imagini = new Folder("Imagini");
        ElementFisier root = new Folder("Root");

        try {
            documente.adaugaNod(fisier1);
            documente.adaugaNod(fisier2);
            imagini.adaugaNod(fisier3);

            root.adaugaNod(documente);
            root.adaugaNod(imagini);

            root.afiseaza("");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
