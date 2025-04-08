package Clase;

public class Portar extends Angajat{
    private int vechime;

    public Portar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
