package model4_observer.model;

public interface Subject {
    void aboneazaClient(IClient client);
    void dezaboneazaClient(IClient client);
    void notificaClienti(String mesaj);
}
