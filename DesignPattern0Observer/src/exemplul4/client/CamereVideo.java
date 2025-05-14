package exemplul4.client;

public class CamereVideo implements Observer{

    @Override
    public void notifica(String tipEveniment, String locatie) {
        if(tipEveniment.equalsIgnoreCase("intruziune")){
            System.out.println("[Camere] Inregistrare pornita in zona: " + locatie);
        }
    }
}
