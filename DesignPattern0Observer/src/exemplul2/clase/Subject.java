package exemplul2.clase;

import exemplul2.client.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(String tipEveniment, String detalii);
}
