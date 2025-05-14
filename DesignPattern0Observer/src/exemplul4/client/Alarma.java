package exemplul4.client;

public class Alarma implements Observer{
    @Override
    public void notifica(String tipEveniment, String locatie) {
        System.out.println("[ALARMA] " + tipEveniment.toUpperCase() + " detectat in " + locatie + "! Suna alarma!");
    }
}
