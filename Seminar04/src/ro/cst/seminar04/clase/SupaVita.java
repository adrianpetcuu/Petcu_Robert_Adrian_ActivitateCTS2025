package ro.cst.seminar04.clase;

public class SupaVita extends Supa{
    private double pretExtra;

    public SupaVita(int gramaj, double pretPerSutaDeGr, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaDeGr, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public double calculPret() {
        return super.calculPret() + pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita comandata cu smantana cu pretul de " + pretExtra + " este gata");
    }
}
