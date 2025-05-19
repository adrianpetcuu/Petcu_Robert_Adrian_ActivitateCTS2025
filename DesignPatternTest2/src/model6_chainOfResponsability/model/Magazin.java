package model6_chainOfResponsability.model;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private List<Produs> listaProduse = new ArrayList<>();
    private ICautare filtruRadacina;

    public Magazin(){
        FiltruCuloare filtruCuloare = new FiltruCuloare();
        FiltruPret filtruPret = new FiltruPret();
        FiltruMarime filtruMarime = new FiltruMarime();

        filtruCuloare.setUrmator(filtruPret);
        filtruPret.setUrmator(filtruMarime);
        this.filtruRadacina = filtruCuloare;
    }

    public void adaugaProdus(Produs produs){
        listaProduse.add(produs);
    }

    public List<Produs> cauta(FiltruParametri parametri){
        return filtruRadacina.filtreaza(listaProduse, parametri);
    }
}
