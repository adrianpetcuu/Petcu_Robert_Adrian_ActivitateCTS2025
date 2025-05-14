package exemplul4.clase;

import exemplul4.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Senzor implements Subject{
    private String locatie;
    private List<Observer> observeri;

    public Senzor(String locatie){
        this.locatie = locatie;
        this.observeri = new ArrayList<>();
    }


    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void notificaObserveri(String tipEveniment, String locatie) {
        for(Observer observer : observeri){
            observer.notifica(tipEveniment, locatie);
        }
    }

    public void detecteaza(String eveniment){
        System.out.println("[Senzor] Eveniment detectat: " + eveniment + " in " + locatie);
        notificaObserveri(eveniment, locatie);
    }
}
