package Decorator.model;

public class SiropCiocolata extends DecoratorBautura{
    public SiropCiocolata(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String getDescriere() {
        return bautura.getDescriere() + ", sirop de ciocolata";
    }

    @Override
    public double getPret() {
        return bautura.getPret() + 2.0;
    }
}
