package exemplul2.client;

public class ClientFidel implements Observer{
    private String nume;

    public ClientFidel(String nume){
        this.nume = nume;
    }

    @Override
    public void notifica(String tipEveniment, String detalii) {
        System.out.println("[Client - " + nume + "] Eveniment: " + tipEveniment + " | " + detalii);
    }
}
