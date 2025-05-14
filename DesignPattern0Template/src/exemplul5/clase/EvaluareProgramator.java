package exemplul5.clase;

public class EvaluareProgramator extends EvaluareCandidat{
    public EvaluareProgramator(String nume) {
        super(nume);
    }

    @Override
    public void colecteazaDate() {
        scorSoftSkills = 20;
    }

    @Override
    public void evalueazaTestTehnic() {
        scorTehnic = 70;
    }

    @Override
    public int calculeazaScorFinal() {
        return scorTehnic + scorSoftSkills;
    }
}
