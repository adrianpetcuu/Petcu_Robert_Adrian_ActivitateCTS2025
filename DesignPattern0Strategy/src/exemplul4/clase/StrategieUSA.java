package exemplul4.clase;

public class StrategieUSA implements StrategieFiscala{
    @Override
    public boolean valideazaCodFiscal(String cod) {
        return cod != null && cod.matches("^[0-9]{2}-[0-9]{7}$");
    }

    @Override
    public double calculeazaTotalCuTaxe(double suma) {
        return suma; // fara taxe
    }

    @Override
    public String genereazaMesajConfirmare(String cod, double suma) {
        return "Payment processed for EIN " + cod + ". No federal tax applied.";
    }
}
