package exemplul1.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeLocuri {
    //creeaza si retine instalele Loc partajate;
    //daca un loc cu acelasi sector + tipScaun a mai fost creat -> returneaza acelasi obiect

    private HashMap<String, ILoc> locuri;

    public FabricaDeLocuri(){
        locuri = new HashMap<>();
    }

    public int getNumarLocuriUnice(){
        return locuri.size();
    }

    public ILoc getLoc(String sector, String tipScaun){
        String cheie = sector + "-" + tipScaun;
        if (!locuri.containsKey(cheie)) {
            locuri.put(cheie, new Loc(sector, tipScaun));
        }
        return locuri.get(cheie);
    }
}
