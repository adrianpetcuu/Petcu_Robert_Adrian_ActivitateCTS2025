package ro.cts.seminar1.main;


import ro.cts.seminar1.clase.*;
import ro.cts.seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Student("andrei", 20, 1));
        listaStudenti.add(new Student("gigel", 20, 2));
        Curs curs = new Curs("CTS", 5, (IPredabil)new Profesor("eduard",22,  1, 6000, 0.2f),
                listaStudenti);
        System.out.println(((Persoana)curs.getCadruDidactic()).calculareVenit());
        curs.sustineExamen("12/02/2025");

        ((IPredabil)curs.getCadruDidactic()).preda();

        Asistent asistent = new Asistent("florin", 45, 2, 1970);
        curs.setCadruDidactic(asistent);
        curs.sustineExamen("21/02/2025");

        
    }
}