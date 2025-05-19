package model7_strategy.model;

import java.util.List;

public class Client implements IClient{
    private String nume;
    private ICautare strategie;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void setStrategie(ICautare strategie) {
        this.strategie = strategie;
    }

    @Override
    public List<Produs> cautaProduse(List<Produs> produse) {
        if(strategie == null){
            throw new IllegalArgumentException("Strategia nu este setata pentru clientul: " + nume);
        }
        return strategie.cauta(produse);
    }


}
