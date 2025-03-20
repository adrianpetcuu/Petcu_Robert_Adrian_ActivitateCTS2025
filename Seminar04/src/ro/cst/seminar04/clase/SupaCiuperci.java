package ro.cst.seminar04.clase;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaDeGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaDeGr, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public double calculPret() {
        return super.calculPret() + (cantitateCiuperci / 100) * getPretPerSutaDeGr();
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu cantitatea de ciuperci " + cantitateCiuperci + " este gata.");
    }
}
