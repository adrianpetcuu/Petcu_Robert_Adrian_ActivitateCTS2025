package exemplul1.decorator;

import exemplul1.clase.IRezervare;

public abstract class Decorator implements IRezervare {
    protected IRezervare rezervare;

    public Decorator(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void descriere() {
        rezervare.descriere();
    }

    @Override
    public double getPret() {
        return rezervare.getPret();
    }
}
