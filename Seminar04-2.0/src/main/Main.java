package main;

import clase.ARezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare = new Rezervare("Daria", 10, "25.10.20", "14:00");
        ARezervare rezervare2 = rezervare.copiaza();
        ARezervare rezervare3 = rezervare.copiaza();

        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());

    }
}