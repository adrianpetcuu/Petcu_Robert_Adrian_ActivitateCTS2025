package exemplul1.strategy;

public interface ModLivrare {
    double calculeazaCostLivrare(double sumaComanda);
    int estimeazaTimpLivrare();
    String genereazaMesaj();
}
