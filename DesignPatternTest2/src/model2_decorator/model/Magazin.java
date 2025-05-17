package model2_decorator.model;

import java.util.HashMap;
import java.util.Map;

public class Magazin implements IMagazin{
    //clasa originala nu se modifica

    private Map<String, String> adreseClienti = new HashMap<>();

    public Magazin(){
        adreseClienti.put("c1", "Bucuresti");
        adreseClienti.put("c2", "Cluj");
    }


    @Override
    public double calculeazaTotal(String clientId, double valoareCos) {
        double transport = adreseClienti.get(clientId).equals("Bucuresti") ? 10 : 20;
        return valoareCos + transport;
    }
}
