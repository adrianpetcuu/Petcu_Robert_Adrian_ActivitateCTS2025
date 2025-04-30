package exemplul4.clase;

public class Facade implements ICalculator{
    private Adunare adunare;
    private Scadere scadere;
    private Inmultire inmultire;
    private Impartire impartire;

    public Facade() {
        this.adunare = new Adunare();
        this.scadere = new Scadere();
        this.inmultire = new Inmultire();
        this.impartire = new Impartire();
    }

    @Override
    public double adunare(double a, double b) {
        return adunare.aduna(a, b);
    }

    @Override
    public double scadere(double a, double b) {
        return scadere.scade(a, b);
    }

    @Override
    public double inmultire(double a, double b) {
        return inmultire.inmulteste(a, b);
    }

    @Override
    public double impartire(double a, double b) {
        return impartire.imparte(a, b);
    }
}
