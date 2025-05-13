package exemplul1.strategy;

import exemplul1.clase.Produs;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private String numeClient;
    private String adresa;
    private List<Produs> produse;
    private ModLivrare modLivrare;

    public Comanda(String numeClient, String adresa, ModLivrare modLivrare){
        this.numeClient = numeClient;
        this.adresa = adresa;
        this.modLivrare = modLivrare;
        this.produse = new ArrayList<>();
    }

    public void adaugaProdus(Produs produs) {
        produse.add(produs);
    }

    public void setModLivrare(ModLivrare modLivrare) {
        this.modLivrare = modLivrare;
    }

    public double calculeazaTotalProduse(){
        return produse.stream().mapToDouble(Produs::getPret).sum();
    }

    public double calculeazaTotalCuLivrare(){
        double total = calculeazaTotalProduse();
        return total + modLivrare.calculeazaCostLivrare(total);
    }


    public void afiseazaDetalii(){
        System.out.println("Client: " + numeClient);
        System.out.println("Adresa: " + adresa);
        System.out.println("Produse comandate: ");
        for(Produs produs : produse){
            System.out.println(" - " + produs);
        }
        System.out.println("Subtotal: " + calculeazaTotalProduse() + " RON.");
        System.out.println("Cost livrare: " + modLivrare.calculeazaCostLivrare(calculeazaTotalProduse()) + "RON.");
        System.out.println("Total de plata: " + calculeazaTotalCuLivrare() + " RON.");
        System.out.println("Timp estimat: " + modLivrare.estimeazaTimpLivrare() + " minute.");
        System.out.println(modLivrare.genereazaMesaj());
    }
}
