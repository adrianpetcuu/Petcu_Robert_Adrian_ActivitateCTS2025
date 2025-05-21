package Decorator.model;

public abstract class DecoratorBautura implements Bautura{
    protected Bautura bautura;

    public DecoratorBautura(Bautura bautura) {
        this.bautura = bautura;
    }

    @Override
    public abstract String getDescriere();

    @Override
    public abstract double getPret();
}
