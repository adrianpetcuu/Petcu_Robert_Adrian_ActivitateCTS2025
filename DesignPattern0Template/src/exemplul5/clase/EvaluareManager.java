package exemplul5.clase;

public class EvaluareManager extends EvaluareCandidat{

    public EvaluareManager(String nume) {
        super(nume);
    }

    @Override
    public void colecteazaDate() {
        scorSoftSkills = 45;
    }

    @Override
    public void evalueazaTestTehnic() {
        scorTehnic = 30;
    }

    @Override
    public int calculeazaScorFinal() {
        return scorTehnic + scorSoftSkills + 5;
    }
}
