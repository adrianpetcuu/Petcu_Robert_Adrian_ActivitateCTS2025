package model6_chainOfResponsability.model;

import java.util.ArrayList;
import java.util.List;

public class FiltruPret implements ICautare{
    private ICautare urmator;
    @Override
    public void setUrmator(ICautare urmator) {
        this.urmator = urmator;
    }

    @Override
    public List<Produs> filtreaza(List<Produs> produse, FiltruParametri parametri) {
        if(parametri.getPretMax() <= 0) {
            return urmator != null ? urmator.filtreaza(produse, parametri) : produse;
        }

        List<Produs> rezultat = new ArrayList<>();
        for(Produs produs : produse){
            if(produs.getPret() <= parametri.getPretMax()){
                rezultat.add(produs);
            }
        }
        return urmator != null ? urmator.filtreaza(produse, parametri) : rezultat;
    }
}
