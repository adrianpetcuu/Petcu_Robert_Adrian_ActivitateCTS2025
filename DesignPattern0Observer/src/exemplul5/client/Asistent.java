package exemplul5.client;

public class Asistent implements Observer{
    @Override
    public void notifica(String tipUrgenta, String locatie) {
        System.out.println("[Asistent] Merg catre " + locatie + " pentru: " + tipUrgenta);
    }
}
