package model6_chainOfResponsability.model;

import java.util.ArrayList;
import java.util.List;

public class FiltruMarime implements ICautare{
    private ICautare urmator;
    @Override
    public void setUrmator(ICautare urmator) {
        this.urmator = urmator;
    }

    @Override
    public List<Produs> filtreaza(List<Produs> produse, FiltruParametri parametri) {
        if(parametri.getMarime() == null){
            return urmator != null ? urmator.filtreaza(produse, parametri) : produse;
        }

        List<Produs> rezultat = new ArrayList<>();
        for(Produs produs : produse){
            if(produs.getMarime().equalsIgnoreCase(parametri.getMarime())){
                rezultat.add(produs);
            }
        }
        return urmator != null ? urmator.filtreaza(produse, parametri) : rezultat;
    }
}
