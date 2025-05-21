package Decorator.model;

public class CeaiVerde implements Bautura{
    @Override
    public String getDescriere() {
        return "Ceai verde";
    }

    @Override
    public double getPret() {
        return 4.0;
    }
}
