package exemplul1.client;

public class Logger implements Observer {
    private String nume;

    public Logger(String nume){
        this.nume = nume;
    }
    @Override
    public void notifica(String numeFisier, String actiune) {
        System.out.println("[LOGGER - " + nume + "] Fisier: " + numeFisier + " a fost " + actiune + ".");
    }
}
