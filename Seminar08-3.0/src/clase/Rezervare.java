package clase;

public class Rezervare implements IRezervare{

    public Rezervare() {
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        System.out.println("Rezervare pentru: " + numeClient + ", " + nrPersoane + " persoane.");
    }
}
