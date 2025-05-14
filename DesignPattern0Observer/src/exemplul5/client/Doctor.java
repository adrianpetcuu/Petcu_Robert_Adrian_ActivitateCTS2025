package exemplul5.client;

public class Doctor implements Observer{
    @Override
    public void notifica(String tipUrgenta, String locatie) {
        System.out.println("[Doctor] Pregatesc sala pentru: " + tipUrgenta + " in " + locatie);
    }
}
