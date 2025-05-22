package Observer.model;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println("Clientul " + nume + " a primit notificarea: " + mesaj);
    }
}
