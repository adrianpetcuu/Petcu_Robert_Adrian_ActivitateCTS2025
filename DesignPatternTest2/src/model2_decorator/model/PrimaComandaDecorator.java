package model2_decorator.model;

import java.util.HashSet;
import java.util.Set;

public class PrimaComandaDecorator extends Decorator{
    private Set<String> clientiProcesati = new HashSet<>();

    public PrimaComandaDecorator(IMagazin magazin) {
        super(magazin);
    }

    @Override
    public double calculeazaTotal(String clientId, double valoareCos) {
        double total = magazin.calculeazaTotal(clientId, valoareCos);
        if(!clientiProcesati.contains(clientId)){
            clientiProcesati.add(clientId);
            System.out.println("Discount 10% aplicat pentru prima comanda a clientului: " + clientId);
            return total * 0.9;
        }
        return total;
    }
}
