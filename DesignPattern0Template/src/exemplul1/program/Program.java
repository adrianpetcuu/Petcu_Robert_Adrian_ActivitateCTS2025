package exemplul1.program;

import exemplul1.clase.ComandaExpress;
import exemplul1.clase.ComandaInternationala;
import exemplul1.clase.ComandaLocala;
import exemplul1.clase.ComandaOnline;

public class Program {
    public static void main(String[] args) {
        ComandaOnline comandaLocala = new ComandaLocala(101);
        comandaLocala.proceseazaComanda();

        System.out.println("---------------------------");

        ComandaOnline comandaInternationala = new ComandaInternationala(202);
        comandaInternationala.proceseazaComanda();

        System.out.println("---------------------------");

        ComandaOnline comandaExpress = new ComandaExpress(303);
        comandaExpress.proceseazaComanda();
    }
}