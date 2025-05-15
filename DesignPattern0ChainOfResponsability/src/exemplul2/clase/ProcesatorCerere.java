package exemplul2.clase;

public abstract class ProcesatorCerere {
    private ProcesatorCerere urmatorul;

    public ProcesatorCerere getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(ProcesatorCerere urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void proceseazaCerere(CerereConcediu cerereConcediu);
}
