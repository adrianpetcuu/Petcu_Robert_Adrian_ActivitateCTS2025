package model6_chainOfResponsability.model;

import java.util.ArrayList;
import java.util.List;

public class FiltruCuloare implements ICautare {
    private ICautare urmator;

    @Override
    public void setUrmator(ICautare urmator) {
        this.urmator = urmator;
    }

    @Override
    public List<Produs> filtreaza(List<Produs> produse, FiltruParametri parametri) {
        if (parametri.getCuloare() == null) {
            return urmator != null ? urmator.filtreaza(produse, parametri) : produse;
        }

        List<Produs> rezultat = new ArrayList<>();
        for (Produs p : produse) {
            if (p.getCuloare().equalsIgnoreCase(parametri.getCuloare())) {
                rezultat.add(p);
            }
        }
        return urmator != null ? urmator.filtreaza(rezultat, parametri) : rezultat;
    }
}
