package clase;

public class ContBancar {
    private String titular;
    private double sold;
    private boolean activ;

    public ContBancar(String titular, double soldInitial) {
        if (soldInitial < 0) {
            throw new IllegalArgumentException("Soldul inițial nu poate fi negativ.");
        }
        this.titular = titular;
        this.sold = soldInitial;
        this.activ = true;
    }

    public String getTitular() {
        return titular;
    }

    public double getSold() {
        return sold;
    }

    public boolean esteActiv() {
        return activ;
    }

    public void inchideCont() {
        this.activ = false;
    }

    public void depune(double suma) {
        if (!activ) {
            throw new IllegalStateException("Contul este închis.");
        }
        if (suma <= 0) {
            throw new IllegalArgumentException("Suma trebuie să fie pozitivă.");
        }
        this.sold += suma;
    }

    public void retrage(double suma) {
        if (!activ) {
            throw new IllegalStateException("Contul este închis.");
        }
        if (suma <= 0) {
            throw new IllegalArgumentException("Suma trebuie să fie pozitivă.");
        }
        if (suma > sold) {
            throw new IllegalArgumentException("Fonduri insuficiente.");
        }
        this.sold -= suma;
    }

    public boolean transferaLa(ContBancar destinatie, double suma) {
        if (!this.activ || !destinatie.esteActiv()) {
            return false;
        }
        if (suma <= 0 || suma > this.sold) {
            return false;
        }
        this.sold -= suma;
        destinatie.depune(suma);
        return true;
    }
}

