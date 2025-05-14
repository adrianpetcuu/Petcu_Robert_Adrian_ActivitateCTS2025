package exemplul2.clase;

import exemplul2.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class ContBancar implements Subject{
    private String iban;
    private double sold;
    private List<Observer> observatori = new ArrayList<>();

    public ContBancar(String iban, double sold){
        this.iban = iban;
        this.sold = sold;
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
    public void notificaObserveri(String tipEveniment, String detalii) {
        for(Observer observer : observatori){
            observer.notifica(tipEveniment, detalii);
        }
    }

    public void retragere(double suma){
        if(suma <= sold){
            sold -= suma;
            notificaObserveri("Retragere", "S-au retras " + suma + " RON din contul " + iban);
        }else{
            notificaObserveri("Eroare", "Fonduri insuficiente pentru retragere din " + iban);
        }
    }

    public void depunere(double suma){
        sold += suma;
        notificaObserveri("Depunere", "S-au depus " + suma + " RON in contul " + iban);
    }

    public void tranzactieInternationala(double suma, String destinatie){
        sold -= suma;
        notificaObserveri("Transfer International", "S-au trimis " + suma + " RON catre " + destinatie);
    }
}
