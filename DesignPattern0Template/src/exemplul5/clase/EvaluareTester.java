package exemplul5.clase;

public class EvaluareTester extends EvaluareCandidat{

    public EvaluareTester(String nume) {
        super(nume);
    }

    @Override
    public void colecteazaDate() {
        scorSoftSkills = 30;
    }

    @Override
    public void evalueazaTestTehnic() {
        scorTehnic = 50;
    }

    @Override
    public int calculeazaScorFinal() {
        return (int)(0.6 * scorTehnic + 0.4 * scorSoftSkills);
    }
}
