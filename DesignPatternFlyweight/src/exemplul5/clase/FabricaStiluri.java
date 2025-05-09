package exemplul5.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaStiluri {
    private Map<String, ICaracter> stiluri;

    public FabricaStiluri(){
        this.stiluri = new HashMap<>();
    }

    public ICaracter getStil(char litera, String font, int marime, boolean bold){
        String cheie = litera + font + marime + bold;
        if(!stiluri.containsKey(cheie)){
            stiluri.put(cheie, new StilCaracter(litera, font, marime, bold));
        }
        return stiluri.get(cheie);
    }

    public int getNumarStiluri(){
        return stiluri.size();
    }
}
