package exemplul4.client;

public class AplicatieMobil implements Observer{
    private String numeUtilizator;

    public AplicatieMobil(String numeUtilizator){
        this.numeUtilizator = numeUtilizator;
    }
    @Override
    public void notifica(String tipEveniment, String locatie) {
        System.out.println("[Notificare app - " + numeUtilizator + "] Alerta: " + tipEveniment + " in " + locatie);
    }
}
