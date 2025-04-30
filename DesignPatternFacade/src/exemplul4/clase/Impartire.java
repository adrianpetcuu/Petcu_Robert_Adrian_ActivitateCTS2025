package exemplul4.clase;

public class Impartire {
    public double imparte(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Impartire la zero!");
        }
        return a / b;
    }
}
