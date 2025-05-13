package exemplul4.clase;

public class StrategieGermania implements StrategieFiscala{
    @Override
    public boolean valideazaCodFiscal(String cod) {
        return cod != null && cod.matches("^DE[0-9]{9}$");
    }

    @Override
    public double calculeazaTotalCuTaxe(double suma) {
        return suma + suma * 0.16;
    }

    @Override
    public String genereazaMesajConfirmare(String cod, double suma) {
        return "Rechnung fur USt-IdNr " + cod + " mit 16% MwSt.";
    }
}
