package Clase;

public class Asistent extends Angajat{
    private double spor;

    public Asistent(String nume, double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", spor=").append(spor);
        sb.append('}');
        return sb.toString();
    }
}
