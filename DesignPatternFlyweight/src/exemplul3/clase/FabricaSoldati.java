package exemplul3.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaSoldati {
    private Map<String, ISoldat> soldati = new HashMap<>();

    public int getNumarTipuriSoldati(){
        return soldati.size();
    }

    public ISoldat getSoldat(String tip){
        if(!soldati.containsKey(tip)){
            switch(tip){
                case "Infanterist":
                    soldati.put(tip, new Soldat("ModelInfanterist", "CamoVerde", "PasMers.mp3"));
                    break;
                case "Lunetist":
                    soldati.put(tip, new Soldat("ModelLunetist", "NegruMat", "SniperShot.mp3"));
                    break;
                default:
                    throw new IllegalArgumentException("Tip necunoscut: " + tip);
            }
        }
        return soldati.get(tip);
    }
}
