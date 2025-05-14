package exemplul3.client;

public class Client implements Observer{
    private String email;

    public Client(String email){
        this.email = email;
    }

    @Override
    public void notifica(String codComanda, String status) {
        System.out.println("[Email catre " + email + "] Comanda " + codComanda + ": " + status);
    }
}
