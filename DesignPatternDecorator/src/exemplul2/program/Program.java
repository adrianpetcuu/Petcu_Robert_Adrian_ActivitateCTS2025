package exemplul2.program;

import exemplul2.clase.AbonamentStandard;
import exemplul2.clase.IAbonament;
import exemplul2.decorator.DecoratorAbonament;
import exemplul2.decorator.DispozitiveExtraDecorator;
import exemplul2.decorator.Streaming4KDecorator;

public class Program {
    public static void main(String[] args) {
        IAbonament abonamentStandard = new AbonamentStandard("Ana Popescu", 40);
        System.out.println("Abonament standard: ");
        abonamentStandard.descriere();
        System.out.println("Pret total: " + abonamentStandard.getPret() + " lei.");
        System.out.println("--------------------------");

        IAbonament abonament4K = new Streaming4KDecorator(abonamentStandard);
        abonament4K.descriere();
        System.out.println("Pret total: " + abonament4K.getPret() + " lei.");
        ((Streaming4KDecorator)abonament4K).anuntaOptiunea();
        System.out.println("--------------------------");

        IAbonament abonamentFull = new DispozitiveExtraDecorator(abonament4K);
        abonamentFull.descriere();
        System.out.println("Pret total: " + abonamentFull.getPret() + " lei.");
        ((DispozitiveExtraDecorator)abonamentFull).anuntaOptiunea();
        System.out.println("--------------------------");
    }
}
