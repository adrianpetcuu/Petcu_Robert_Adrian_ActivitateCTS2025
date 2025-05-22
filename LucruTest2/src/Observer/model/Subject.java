package Observer.model;

import javax.management.ObjectName;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObservatori();
}
