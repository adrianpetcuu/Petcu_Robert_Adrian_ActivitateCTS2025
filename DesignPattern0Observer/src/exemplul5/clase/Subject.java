package exemplul5.clase;

import exemplul5.client.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(String tipUrgenta, String locatie);
}
