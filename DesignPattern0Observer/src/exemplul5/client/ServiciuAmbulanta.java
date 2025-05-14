package exemplul5.client;

public class ServiciuAmbulanta implements Observer{
    @Override
    public void notifica(String tipUrgenta, String locatie) {
        System.out.println("[Ambulanta] Trimitem echipaj la " + locatie + " pentru: " + tipUrgenta);
    }
}
