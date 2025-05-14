package exemplul4.clase;

import exemplul4.client.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(String tipEveniment, String locatie);
}
