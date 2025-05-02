package exemplul3.program;

import exemplul3.clase.Comanda;
import exemplul3.clase.IComanda;
import exemplul3.decorator.DecoratorAmbalajEco;
import exemplul3.decorator.DecoratorLivrareRapida;

public class Program {
    public static void main(String[] args) {
        IComanda comanda = new Comanda("Popescu Maria", 50, 60);
        System.out.println("Comanda de baza: ");
        comanda.descriere();
        System.out.println("Cost total: " + comanda.getCostTotal() + " lei.");
        System.out.println("Timp estimat: " + comanda.getTimpEstimativ() + " minute.");
        System.out.println("-----------------------------");

        IComanda comandaLivrareRapida = new DecoratorLivrareRapida(comanda);
        comandaLivrareRapida.descriere();
        System.out.println("Cost total: " + comandaLivrareRapida.getCostTotal() + " lei.");
        System.out.println("Timp estimativ: " + comandaLivrareRapida.getTimpEstimativ() + " minute.");
        System.out.println("-----------------------------");

        IComanda comandaAmbalajEco = new DecoratorAmbalajEco(comandaLivrareRapida);
        comandaAmbalajEco.descriere();
        System.out.println("Cost total: " + comandaAmbalajEco.getCostTotal() + " lei.");
        System.out.println("Timp estimativ: " + comandaAmbalajEco.getTimpEstimativ() + " minute.");
        System.out.println("------------------------------");
    }
}
