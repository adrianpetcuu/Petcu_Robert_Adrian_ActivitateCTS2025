package exemplul5.clase;

import exemplul5.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class SenzorUrgenta implements Subject {
    private List<Observer> observatori = new ArrayList<>();

    @Override
    public void adaugaObserver(Observer observer) {
        observatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observatori.remove(observer);
    }

    @Override
    public void notificaObserveri(String tipUrgenta, String locatie) {
        for(Observer observer : observatori){
            observer.notifica(tipUrgenta, locatie);
        }
    }

    public void declanseaza(String tip, String locatie){
        System.out.println("[Senzor] Urgenta detectata: " + tip + " in " + locatie);
        notificaObserveri(tip, locatie);
    }
}
