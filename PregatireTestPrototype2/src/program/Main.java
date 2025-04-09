package program;

import clase.IRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare("Adrian Petcu", 2, "0040764345246");
        Rezervare rezervare2 = (Rezervare) rezervare.copiaza();
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}