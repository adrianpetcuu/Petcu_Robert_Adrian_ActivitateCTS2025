package ro.cst.seminar04.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaDeGr;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaDeGr, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGr = pretPerSutaDeGr;
        this.ingrediente = ingrediente;
    }

    public abstract void preparareSupa();
    public double calculPret(){
        return (gramaj / 100) * pretPerSutaDeGr;
    }

    public double getPretPerSutaDeGr() {
        return pretPerSutaDeGr;
    }
}
