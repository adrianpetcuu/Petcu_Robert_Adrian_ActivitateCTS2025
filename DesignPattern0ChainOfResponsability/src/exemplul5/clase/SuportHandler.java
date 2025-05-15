package exemplul5.clase;

public abstract class SuportHandler {
    private SuportHandler urmatorul;

    public SuportHandler getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(SuportHandler urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void gestioneazaCerere(CerereSuport cerere);
}
