package Clase;

public class Secretar extends Angajat{
    private int vechime;

    public Secretar(String nume, double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
