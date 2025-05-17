package model3_composite.model;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IProdus, Composite{
    private String numeCategorie;
    private List<IProdus> lista;

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaProdus(IProdus produs) throws Exception {
        lista.add(produs);
    }

    @Override
    public void stergeProdus(IProdus produs) throws Exception {
        lista.remove(produs);
    }

    @Override
    public IProdus getNodCopil(int index) throws Exception {
        return lista.get(index);
    }

    @Override
    public void afiseaza(){
        System.out.println("Categorie: " + numeCategorie + " => Nr. produse/subcategorii: " + getNrProduse());
        for(IProdus produs : lista){
            produs.afiseaza();
        }
    }

    @Override
    public int getNrProduse() {
        return lista.size();
    }

}
