package exemplul1.clase;

public class Client {
    private String numeClient;
    private String emailClient;
    private String numarTelefon;
    private boolean areAplicatie;

    public Client(String numeClient, String emailClient, String numarTelefon, boolean areAplicatie) {
        this.numeClient = numeClient;
        this.emailClient = emailClient;
        this.numarTelefon = numarTelefon;
        this.areAplicatie = areAplicatie;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public boolean isAreAplicatie() {
        return areAplicatie;
    }
}
