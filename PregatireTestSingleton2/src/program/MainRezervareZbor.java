package program;

import clase.RezervareZborThreadSafe;

public class MainRezervareZbor {
    public static void main(String[] args) {
        RezervareZborThreadSafe rezervareZbor = RezervareZborThreadSafe.getInstance();

        System.out.println(rezervareZbor.status());
        rezervareZbor.rezervaLoc("Ioana");
        rezervareZbor.rezervaLoc("Mihai");
        rezervareZbor.rezervaLoc("Ioana");
        System.out.println(rezervareZbor.status());
        System.out.println("Pasageri: " + rezervareZbor.getListaPasageri());

        rezervareZbor.anuleazaRezervare("Ioana");
        System.out.println("Pasageri dupa anulare: " + rezervareZbor.getListaPasageri());
        System.out.println(rezervareZbor.status());
    }
}
