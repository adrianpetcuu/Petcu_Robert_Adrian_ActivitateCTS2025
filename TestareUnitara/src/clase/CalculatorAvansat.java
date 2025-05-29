package clase;

public class CalculatorAvansat {

    public int aduna(int a, int b) {
        return a + b;
    }

    public int scade(int a, int b) {
        return a - b;
    }

    public int inmulteste(int a, int b) {
        return a * b;
    }

    public double imparte(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Impartirea la 0 nu e permisa");
        }
        return (double) a / b;
    }

    public int ridicaLaPutere(int baza, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponentul trebuie sa fie pozitiv");
        }
        return (int) Math.pow(baza, exponent);
    }

    public int radical(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nu se poate calcula radicalul unui numar negativ");
        }
        return (int) Math.sqrt(n);
    }
}
