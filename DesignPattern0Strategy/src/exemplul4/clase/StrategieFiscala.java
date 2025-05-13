package exemplul4.clase;

public interface StrategieFiscala {
    boolean valideazaCodFiscal(String cod);
    double calculeazaTotalCuTaxe(double suma);
    String genereazaMesajConfirmare(String cod, double suma);
}
