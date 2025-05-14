package exemplu1.clase;

import exemplu1.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class FileMonitor implements Subject{
    private String numeSursa;
    private List<Observer> observatori = new ArrayList<>();

    public FileMonitor(String numeSursa){
        this.numeSursa = numeSursa;
    }

    @Override
    public void adaugaObserver(Observer observer){
        observatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer){
        observatori.remove(observer);
    }

    @Override
    public void notificaObserveri(String numeFisier, String actiune){
        for(Observer observer : observatori){
            observer.notifica(numeFisier, actiune);
        }
    }

    public void evenimentAdaugare(String fisier){
        System.out.println("[Monitor] Fisier adaugat: " + fisier);
        notificaObserveri(fisier, "adaugat");
    }

    public void evenimentModificare(String fisier){
        System.out.println("[Monitor] Fisier modificat: " + fisier);
        notificaObserveri(fisier, "modificat");
    }

    public void evenimentStergere(String fisier){
        System.out.println("[Monitor] Fisier sters: " + fisier);
        notificaObserveri(fisier, "sters");
    }

}
