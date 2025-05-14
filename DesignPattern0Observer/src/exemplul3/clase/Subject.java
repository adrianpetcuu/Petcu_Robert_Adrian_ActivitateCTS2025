package exemplul3.clase;

import exemplul3.client.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(String comanda, String status);
}
