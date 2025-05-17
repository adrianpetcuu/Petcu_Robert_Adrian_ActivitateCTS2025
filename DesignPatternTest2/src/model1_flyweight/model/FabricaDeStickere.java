package model1_flyweight.model;

import java.util.HashMap;

public class FabricaDeStickere {
    private HashMap<String, Sticker> stoc = new HashMap<>();

    public Sticker getSticker(Masina masina){
        String cheie = masina.getModel() + "-" + masina.getAnFabricatie();
        if(!stoc.containsKey(cheie)) {
            stoc.put(cheie, new Sticker(masina));
        }
        return stoc.get(cheie);
    }

    public int getDimensiune(){
        return stoc.size();
    }
}
