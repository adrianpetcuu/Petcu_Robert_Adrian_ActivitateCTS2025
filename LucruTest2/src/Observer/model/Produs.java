package Observer.model;

import java.util.ArrayList;
import java.util.List;

public class Produs implements Subject{
    private String nume;
    private int stoc;
    private List<Observer> observatori = new ArrayList<>();

    public Produs(String nume, int stoc) {
        this.nume = nume;
        this.stoc = stoc;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observatori.remove(observer);
    }

    @Override
    public void notificaObservatori() {
        for(Observer observer : observatori){
            observer.notifica("Produsul " + nume + " este din nou in stoc.");
        }
    }

    public void alimenteaza(int cantitate){
        stoc += cantitate;
        System.out.println("Stocul pentru: " + nume + " a fost alimentat cu " + cantitate);
        notificaObservatori();
    }

    public void vinde(int cantitate){
        if(stoc >= cantitate){
            stoc -= cantitate;
            System.out.println("Vandut " + cantitate + " bucati din " + nume + ". Stoc ramas: " + stoc);
        } else {
            System.out.println("Stoc insuficient pentru " + nume + ".");
        }
        if(stoc == 0){
            System.out.println(nume + " este epuizat din stoc.");
        }
    }
}
