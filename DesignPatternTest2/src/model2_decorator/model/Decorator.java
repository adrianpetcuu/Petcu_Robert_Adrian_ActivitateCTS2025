package model2_decorator.model;

public abstract class Decorator implements IMagazin{
    protected IMagazin magazin;

    public Decorator(IMagazin magazin){
        this.magazin = magazin;
    }
    @Override
    public abstract double calculeazaTotal(String clientId, double valoareCos);
}
