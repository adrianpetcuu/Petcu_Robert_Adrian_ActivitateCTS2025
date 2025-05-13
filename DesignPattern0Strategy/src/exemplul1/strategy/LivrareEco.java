package exemplul1.strategy;

import java.util.Random;

public class LivrareEco implements ModLivrare{
    @Override
    public double calculeazaCostLivrare(double sumaComanda) {
        return 6.0;
    }

    @Override
    public int estimeazaTimpLivrare() {
        return 30 + new Random().nextInt(20);
    }

    @Override
    public String genereazaMesaj() {
        return "Livrare eco: curierul este pe bicicleta - timp estimat variabil.";
    }
}
