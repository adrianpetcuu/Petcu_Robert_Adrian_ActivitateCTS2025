package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;


    public Asistent() {
        super("Asistent", 25);
        this.idAsistent = 0;
        this.salariu = 0;
    }

    public Asistent(String nume, int varsta, int idAsistent, float salariu) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }


    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public void preda() {

    }

    // getter pentru salariu , nu are spor si returneaza direct salariul
    @Override
    public float calculareVenit() {
        return salariu;
    }
}
