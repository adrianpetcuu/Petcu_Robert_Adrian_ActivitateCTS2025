package exemplul3.clase;

import exemplul3.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class ComandaOnline implements Subject{
    private String codComanda;
    private List<Observer> observatori;

    public ComandaOnline(String codComanda){
        this.codComanda = codComanda;
        this.observatori = new ArrayList<>();
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
    public void notificaObserveri(String comanda, String status) {
        for(Observer observer : observatori){
            observer.notifica(comanda, status);
        }
    }

    public void plaseazaComanda(){
        System.out.println("[Sistem] Comanda a fost plasata cu succes.");
        notificaObserveri(codComanda, "plasata");
    }

    public void livreazaComanda(){
        System.out.println("[Sistem] Comanda este in curs de livrare.");
        notificaObserveri(codComanda, "in livrare");
    }

    public void finalizeazaComanda(){
        System.out.println("[Sistem] Comanda a fost livrata.");
        notificaObserveri(codComanda, "livrata");
    }
}
