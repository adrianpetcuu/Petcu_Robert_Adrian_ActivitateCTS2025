package exemplul4.clase;

public class Server implements IServer{
    private String numeServer;
    private String[] roluriPermise;

    public Server(String numeServer, String[] roluriPermise) {
        this.numeServer = numeServer;
        this.roluriPermise = roluriPermise;
    }

    public String[] getRoluriPermise() {
        return roluriPermise;
    }

    @Override
    public void conecteaza(String utilizator, String rol, int oraAcces) {
        System.out.println("Utilizatorul " + utilizator + " s-a conectat la serverul " + numeServer + " cu rolul de " + rol + " la ora " + oraAcces + ":00.");
    }
}
