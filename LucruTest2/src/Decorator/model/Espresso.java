package Decorator.model;

public class Espresso implements Bautura{
    @Override
    public String getDescriere() {
        return "Espresso";
    }

    @Override
    public double getPret() {
        return 5.0;
    }
}
