package exemplul4.program;

import exemplul4.clase.GeneratorRaport;
import exemplul4.clase.RaportCompanieMare;
import exemplul4.clase.RaportONG;
import exemplul4.clase.RaportStartup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        GeneratorRaport raportCompanieMare = new RaportCompanieMare("MegaCorp", Arrays.asList(10000.0, 15000.0, 13000.0));
        List<Double> venituriLunare = new ArrayList<>();
        venituriLunare.add(800.0);
        venituriLunare.add(1200.0);
        venituriLunare.add(3000.0);
        GeneratorRaport raportStartup = new RaportStartup("InovateX", venituriLunare);
        List<Double> venituriLunare2 = new ArrayList<>();
        venituriLunare2.add(1000.0);
        venituriLunare2.add(1200.0);
        venituriLunare2.add(1800.0);
        GeneratorRaport raportONG = new RaportONG("GreenLife", venituriLunare2);


        raportCompanieMare.genereazaRaport();
        System.out.println();
        raportStartup.genereazaRaport();
        System.out.println();
        raportONG.genereazaRaport();

    }
}
