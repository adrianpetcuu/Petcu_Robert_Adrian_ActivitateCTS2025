package model4_observer.model;

import java.sql.SQLOutput;

public class ClientSMS implements IClient{
    private String numeClient;
    private String numarTelefon;
    private String email;

    public ClientSMS(String numeClient, String numarTelefon, String email) {
        this.numeClient = numeClient;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul: " + numeClient + " a primit notificare SMS pe numarul: " + numarTelefon + ".");
        System.out.println("Mesaj: " + mesaj);
    }
}
