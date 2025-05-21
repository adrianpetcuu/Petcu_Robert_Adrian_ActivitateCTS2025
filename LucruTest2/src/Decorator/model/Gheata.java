package Decorator.model;

public class Gheata extends DecoratorBautura{
    public Gheata(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String getDescriere() {
        return bautura.getDescriere() + ", gheata";
    }

    @Override
    public double getPret() {
        return bautura.getPret() + 0.5;
    }
}
