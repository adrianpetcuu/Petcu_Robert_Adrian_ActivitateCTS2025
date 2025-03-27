package Clase;

public class Medic extends Angajat{
    private double spor;

    public Medic(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("spor=").append(spor);
        sb.append('}');
        return sb.toString();
    }
}
