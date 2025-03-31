package Main;

import Clase.Computer;
import Clase.ComputerBuilder;

public class Main {
    public static void main(String[] args) {
        Computer gamingPc = new ComputerBuilder()
                .setProcesor("AMD Ryzen 9")
                .setRam(32)
                .setStocare(1000)
                .setPlacaVideo(true)
                .setBluetooth(true)
                .build();

        Computer officePc = new ComputerBuilder()
                .setRam(16)
                .setStocare(512)
                .build();

        System.out.println(gamingPc);
        System.out.println(officePc);
    }
}
