package exemplul4.clase;


public class StrategieRomania implements StrategieFiscala {
    @Override
    public boolean valideazaCodFiscal(String cod) {
        return cod != null && cod.matches("^RO[0-9]{8,10}$");
    }

    @Override
    public double calculeazaTotalCuTaxe(double suma) {
        return suma + suma * 0.19; // tva 19%
    }

    @Override
    public String genereazaMesajConfirmare(String cod, double suma) {
        return "Factura emisa pentru CUI " + cod + " cu TVA 19%.";
    }
}
