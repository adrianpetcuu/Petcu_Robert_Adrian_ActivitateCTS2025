package model5_strategy.model;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("[Card] " + numeClient + " a platit suma de " + suma + " RON cu cardul.");
    }
}
