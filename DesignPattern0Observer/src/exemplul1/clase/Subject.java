package exemplul1.clase;

import exemplul1.client.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(String numeFisier, String actiune);
}
