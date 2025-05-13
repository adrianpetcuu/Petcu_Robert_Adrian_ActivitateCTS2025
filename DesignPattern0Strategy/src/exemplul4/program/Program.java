package exemplul4.program;

import exemplul4.clase.ProcesatorPlata;
import exemplul4.clase.StrategieGermania;
import exemplul4.clase.StrategieRomania;
import exemplul4.clase.StrategieUSA;

public class Program {
    public static void main(String[] args) {
        ProcesatorPlata procesatorPlata = new ProcesatorPlata(new StrategieRomania());
        procesatorPlata.proceseazaPlata("RO1234567890", 1000);

        System.out.println("\n=== Schimbare tara: Germania ===");
        procesatorPlata.setStrategieFiscala(new StrategieGermania());
        procesatorPlata.proceseazaPlata("DE123456789", 2000);

        System.out.println("\n=== Schimbare tara: SUA ===");
        procesatorPlata.setStrategieFiscala(new StrategieUSA());
        procesatorPlata.proceseazaPlata("12-3456789", 5000);
    }
}
