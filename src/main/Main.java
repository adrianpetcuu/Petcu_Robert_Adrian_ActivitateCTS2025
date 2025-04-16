package main;

import clase.Cafea;
import clase.CafeaBuilder;

public class Main {
    public static void main(String[] args) {
        Cafea cafea = new CafeaBuilder("Cafea cu lapte").build();
        System.out.println(cafea.toString());
        Cafea cafea2 = new CafeaBuilder("Cafea Ness").setPret(20).setBaza("Ness").setVolum(20.5).setToppinguri("Ness si cacao").build();
        System.out.println(cafea2.toString());

    }
}