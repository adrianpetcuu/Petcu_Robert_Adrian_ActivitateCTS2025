package exemplul5.clase;

public class CalculRCA implements StrategieCalcul{

    @Override
    public double calculeaza(PolitaAsigurare politaAsigurare) {
        int capacitateCilindrica = politaAsigurare.getCapacitateCilindrica();
        int varstaSofer = politaAsigurare.getVarstaSofer();
        double baza = capacitateCilindrica * 0.15;
        if(varstaSofer < 25) {
            baza *= 1.25;
        }
        return baza;
    }

    @Override
    public String descriere() {
        return "Calcul RCA: capacitate * 0.15 (+ penalizare < 25 ani)";
    }
}
