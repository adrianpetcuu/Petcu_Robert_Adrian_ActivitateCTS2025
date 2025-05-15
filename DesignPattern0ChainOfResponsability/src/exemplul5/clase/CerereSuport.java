package exemplul5.clase;

public class CerereSuport {
    private String numeClient;
    private String mesaj;
    private int nivelDificultate;

    public CerereSuport(String numeClient, String mesaj, int nivelDificultate) {
        this.numeClient = numeClient;
        this.mesaj = mesaj;
        this.nivelDificultate = nivelDificultate;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getMesaj() {
        return mesaj;
    }

    public int getNivelDificultate() {
        return nivelDificultate;
    }
}
