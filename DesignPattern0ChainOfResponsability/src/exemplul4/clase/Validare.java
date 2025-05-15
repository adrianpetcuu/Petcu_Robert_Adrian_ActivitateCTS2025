package exemplul4.clase;

public abstract class Validare {
    private Validare urmatorul;

    public void setUrmatorul(Validare urmatorul){
        this.urmatorul = urmatorul;
    }

    public Validare getUrmatorul(){
        return urmatorul;
    }

    public abstract void valideaza(Formular formular);
}
