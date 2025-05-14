package exemplul3.program;

import exemplul3.clase.ComandaOnline;
import exemplul3.client.Client;
import exemplul3.client.Depozit;
import exemplul3.client.ServiciuFacturare;

public class Program {
    public static void main(String[] args) {
        ComandaOnline comandaOnline = new ComandaOnline("CMD1234");

        comandaOnline.adaugaObserver(new Client("andrei@gmail.com"));
        comandaOnline.adaugaObserver(new Depozit());
        comandaOnline.adaugaObserver(new ServiciuFacturare());

        comandaOnline.plaseazaComanda();
        System.out.println();
        comandaOnline.livreazaComanda();
        System.out.println();
        comandaOnline.finalizeazaComanda();
    }
}
