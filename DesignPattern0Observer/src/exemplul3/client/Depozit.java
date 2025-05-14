package exemplul3.client;

public class Depozit implements Observer{
    @Override
    public void notifica(String codComanda, String status) {
        if(status.equals("plasata")){
            System.out.println("[Depozit] Inregistrat comanda pentru ambalare: " + codComanda);
        }
    }
}

