package exemplul1.strategy;

public class LivrareRapida implements ModLivrare{
    @Override
    public double calculeazaCostLivrare(double sumaComanda) {
        return sumaComanda * 0.2 + 5;
    }

    @Override
    public int estimeazaTimpLivrare() {
        return 25;
    }

    @Override
    public String genereazaMesaj() {
        return "Livrare rapida: curierul este pe drum, ajunge in 20-30 minute.";
    }
}
