package model7_strategy.model;

import java.util.ArrayList;
import java.util.List;

public class StrategieImplicita implements ICautare{

    @Override
    public List<Produs> cauta(List<Produs> produse) {
        List<Produs> rezultate = new ArrayList<>();
        for(Produs produs : produse){
            if(produs.getCuloare().equalsIgnoreCase("negru") &&
                produs.getPret() <= 300 && produs.getMarime().equalsIgnoreCase("42")) {
                rezultate.add(produs);
            }
        }
        return rezultate;
    }
}
