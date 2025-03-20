package ro.cst.seminar04.clase;

public class SupaLegume extends Supa{
    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaDeGr, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaDeGr, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public double calculPret() {
        return super.calculPret() + (gramajCrutoane / 100) * getPretPerSutaDeGr();
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu  "+ gramajCrutoane + " grame de crutoane este gata.");
    }
}
