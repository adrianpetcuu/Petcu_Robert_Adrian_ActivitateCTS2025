package model4_observer.model;

public class ClientMultiplu implements IClient{
    private String numeClient;
    private String numarTelefon;
    private String email;

    public ClientMultiplu(String numeClient, String numarTelefon, String email) {
        this.numeClient = numeClient;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul: " + numeClient + " a primit notificare pe emailul: " + email + " si a primit notificare SMS pe numarul: " + numarTelefon + ".");
        System.out.println("Mesaj: " + mesaj);
    }
}
