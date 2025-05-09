package exemplul4.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaLocuri {
    //creeaza un singur obiect pentru fiecare tip de loc
    //reutilizeaza acea instanta pentru toate locurile cu acea categorie
    private Map<String, ITipLoc> tipuriLocuri = new HashMap<>();

    public ITipLoc getTipLoc(String categorie){
        if(!tipuriLocuri.containsKey(categorie)){
            switch(categorie){
                case "VIP":
                    tipuriLocuri.put(categorie, new TipLoc("VIP", "Rosu", 100.00));
                    break;
                case "Premium":
                    tipuriLocuri.put(categorie, new TipLoc("Premium", "Albastru", 75.00));
                    break;
                case "Standard":
                    tipuriLocuri.put(categorie, new TipLoc("Standard", "Gri", 50.00));
                    break;
                default:
                    throw new IllegalArgumentException("Categorie necunoscuta: " + categorie);
            }
        }
        return tipuriLocuri.get(categorie);
    }

    public int getNumarTipuriLocuri(){
        return tipuriLocuri.size();
    }
}
