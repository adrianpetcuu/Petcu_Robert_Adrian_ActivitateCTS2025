package exemplul5.clase;

public abstract class EvaluareCandidat{
    protected String nume;
    protected int scorSoftSkills;
    protected int scorTehnic;

    public EvaluareCandidat(String nume){
        this.nume = nume;
    }

    public abstract void colecteazaDate();
    public abstract void evalueazaTestTehnic();
    public abstract int calculeazaScorFinal();

    public void decizieAngajare(int scorFinal){
        if(scorFinal >= 80){
            System.out.println(nume + " a fost ACCEPTAT cu scorul final: " + scorFinal);
        } else {
            System.out.println(nume + " a fost RESPINS cu scorul final: " + scorFinal);
        }
    }

    public final void evalueaza(){
        colecteazaDate();
        evalueazaTestTehnic();
        int scorFinal = calculeazaScorFinal();
        decizieAngajare(scorFinal);
    }
}
