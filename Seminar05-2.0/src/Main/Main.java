package Main;

import Clase.Pacient;
import Clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setNumeInsotitor("Maricica").setAreHalat(false).setArePapuciDeCameara(true);
        Pacient pacient = pacientBuilder.build("Costel");
        System.out.println(pacient.toString());
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Maria").build("Ion");
        System.out.println(pacient1.toString());
        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Ana").build("Ioana");
        System.out.println(pacient2.toString());
    }
}