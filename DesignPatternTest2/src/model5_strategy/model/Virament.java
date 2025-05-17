package model5_strategy.model;

public class Virament implements ModPlata{

    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("[VIRAMENT] " + numeClient + " a platit suma de " + suma + " RON prin virament bancar.");
    }
}
