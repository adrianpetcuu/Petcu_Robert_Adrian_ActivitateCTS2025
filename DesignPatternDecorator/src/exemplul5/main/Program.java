package exemplul5.main;

import exemplul5.clase.ITichet;
import exemplul5.clase.TichetSimplu;
import exemplul5.decorator.DecoratorAsigurare;
import exemplul5.decorator.VIPDecorator;
import exemplul5.decorator.ValabilitateNoapteDecorator;

public class Program {
    public static void main(String[] args) {
        ITichet tichetSimplu = new TichetSimplu("Mihai Popescu", 15);
        System.out.println("Tichet standard: ");
        tichetSimplu.afiseaza();
        System.out.println();

        ITichet tichetAsigurare = new DecoratorAsigurare(tichetSimplu);
        System.out.println("Tichet cu asigurare: ");
        tichetAsigurare.afiseaza();
        System.out.println();

        ITichet tichet2 = new VIPDecorator(tichetSimplu);
        System.out.println("Tichet VIP: ");
        tichet2.afiseaza();
        System.out.println();

        ITichet tichetVIP = new VIPDecorator(tichetAsigurare);
        System.out.println("Tichet cu asigurare si acces VIP:");
        tichetVIP.afiseaza();
        System.out.println();

        ITichet tichetFull = new ValabilitateNoapteDecorator(tichetVIP);
        System.out.println("Tichet complet: ");
        tichetFull.afiseaza();
        System.out.println();
    }
}
