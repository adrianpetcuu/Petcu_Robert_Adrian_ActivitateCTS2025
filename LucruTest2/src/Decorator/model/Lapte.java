package Decorator.model;

public class Lapte extends DecoratorBautura{
    public Lapte(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String getDescriere() {
        return bautura.getDescriere() + ", lapte";
    }

    @Override
    public double getPret() {
        return bautura.getPret() + 1.5;
    }
}
