package exemplul3.clase;

public abstract class Verificator{
    private Verificator urmatorul;

    public Verificator getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(Verificator urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void verifica(Tranzactie tranzactie);
}
