package exemplul1.program;

import exemplul1.clase.IRezervare;
import exemplul1.clase.Rezervare;
import exemplul1.decorator.DecorRomanticDecorator;
import exemplul1.decorator.GeamDecorator;
import exemplul1.decorator.MuzicaDecorator;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        IRezervare rezervare = new Rezervare("Andrei Popescu", 2, LocalDateTime.of(2025, 5, 15, 19, 30), 150);
        System.out.println("Rezervare simpla:");
        rezervare.descriere();
        System.out.println("Pret final: " + rezervare.getPret() + " lei.");
        System.out.println("------------------------------");

        IRezervare rezervareGeam = new GeamDecorator(rezervare);
        System.out.println("Rezervare geam:");
        rezervareGeam.descriere();
        System.out.println("Pret final: " + rezervareGeam.getPret() + " lei.");
        System.out.println("------------------------------");


        IRezervare rezervareMuzica = new MuzicaDecorator(rezervareGeam);
        System.out.println("Rezervare geam + muzica:");
        rezervareMuzica.descriere();
        System.out.println("Pret final: " + rezervareMuzica.getPret() + " lei.");
        System.out.println("------------------------------");

        IRezervare rezervareDecorRomantic = new DecorRomanticDecorator(rezervareMuzica);
        System.out.println("Rezervare geam + muzica + decor romantic:");
        rezervareDecorRomantic.descriere();
        System.out.println("Pret final: " + rezervareDecorRomantic.getPret() + " lei.");
        System.out.println("------------------------------");

    }
}