package exemplul5.client;

public class DispecerSMURD implements Observer{
    @Override
    public void notifica(String tipUrgenta, String locatie) {
        System.out.println("[Dispecer SMURD] Alerta repectionata din " + locatie + ": " + tipUrgenta);
    }
}