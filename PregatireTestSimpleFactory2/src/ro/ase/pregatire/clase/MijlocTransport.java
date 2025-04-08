package ro.ase.pregatire.clase;

public abstract class MijlocTransport {
    private String sofer;
    private boolean esteFunctional;

    public MijlocTransport(String sofer, boolean esteFunctional) {
        this.sofer = sofer;
        this.esteFunctional = esteFunctional;
    }

    public String getSofer() {
        return sofer;
    }

    public boolean getEsteFunctional() {
        return esteFunctional;
    }

    public abstract void afiseazaDetalii();
}
