package exemplul5.clase;

import exemplul5.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemAlerta implements Observer, Subject{
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

    @Override
    public void notifica(String tipUrgenta, String locatie) {
        System.out.println("[Sistem Alerta] S-a declansat semnalul sonor pentru: " + tipUrgenta);
        notificaObserveri(tipUrgenta, locatie);
    }
}
