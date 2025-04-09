package cts.petcu.adrian.g1097.builder.main;

import cts.petcu.adrian.g1097.builder.model.Bicicleta;
import cts.petcu.adrian.g1097.builder.model.BicicletaBuilder;

public class Main {
    public static void main(String[] args) {
        Bicicleta b1 = new BicicletaBuilder().setDiametruRoti(28).setTipFrana("Disc").setCascaProtectie(true).setOchelari(true).build();
        Bicicleta b2 = new BicicletaBuilder().setOchelari(true).setCascaProtectie(false).build();
        Bicicleta b3 = new BicicletaBuilder().setDiametruRoti(30).setOchelari(true).setCascaProtectie(true).build();
        Bicicleta b4 = new BicicletaBuilder().build();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }
}