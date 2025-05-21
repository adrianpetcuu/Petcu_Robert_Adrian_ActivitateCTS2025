package Flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    private Map<String, MasinaFlyweight> masini = new HashMap<>();

    public MasinaFlyweight getMasina(String marca, String model, String culoare){
        String cheie = marca + "-" + model + "-" + culoare;
        if(!masini.containsKey(cheie)){
            System.out.println("Creare noua masina de tip: " + cheie);
            masini.put(cheie, new MasinaTip(marca, model, culoare));
        }
        return masini.get(cheie);
    }
}
