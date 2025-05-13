package exemplul1.strategy;

public class LivrareStandard implements ModLivrare{
    @Override
    public double calculeazaCostLivrare(double sumaComanda) {
        return 10.0;
    }

    @Override
    public int estimeazaTimpLivrare() {
        return 50;
    }

    @Override
    public String genereazaMesaj() {
        return "Livrare standard: curierul va ajunge in aproximativ 45-60 minute.";
    }
}
