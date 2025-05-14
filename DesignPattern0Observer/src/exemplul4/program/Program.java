package exemplul4.program;

import exemplul4.clase.Senzor;
import exemplul4.client.Alarma;
import exemplul4.client.AplicatieMobil;
import exemplul4.client.CamereVideo;

public class Program {
    public static void main(String[] args) {
        Senzor senzorHol = new Senzor("Hol intrare");

        senzorHol.adaugaObserver(new Alarma());
        senzorHol.adaugaObserver(new AplicatieMobil("Andrei"));
        senzorHol.adaugaObserver(new CamereVideo());

        senzorHol.detecteaza("intruziune");
        System.out.println();
        senzorHol.detecteaza("fum");
    }
}
