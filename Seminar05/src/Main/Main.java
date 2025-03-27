package Main;

import Clase.Pacient;
import Clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("George");
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Georgica").setAreHalat(true).getPacient();
        System.out.println(pacient1.toString());
        //pacient1.setNumeInsotitor("Gigel");
        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Insotitor2").setAreMicDejun(true).getPacient();
        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}