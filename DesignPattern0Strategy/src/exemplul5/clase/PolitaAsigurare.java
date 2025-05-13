package exemplul5.clase;

public class PolitaAsigurare {
    private String numeClient;
    private int varstaSofer;
    private int capacitateCilindrica;
    private double valoareVehicul;
    private int numarDaune;
    private String zonaUtilizare;

    private StrategieCalcul strategieCalcul;

    public PolitaAsigurare(String numeClient, int varstaSofer, int capacitateCilindrica, double valoareVehicul, int numarDaune, String zonaUtilizare, StrategieCalcul strategieCalcul) {
        this.numeClient = numeClient;
        this.varstaSofer = varstaSofer;
        this.capacitateCilindrica = capacitateCilindrica;
        this.valoareVehicul = valoareVehicul;
        this.numarDaune = numarDaune;
        this.zonaUtilizare = zonaUtilizare;
        this.strategieCalcul = strategieCalcul;
    }

    public void setStrategieCalcul(StrategieCalcul strategieCalcul){
        this.strategieCalcul = strategieCalcul;
    }

    public void afiseazaDetalii(){
        System.out.println("Client: " + numeClient);
        System.out.println("Tip strategie: " + strategieCalcul.descriere());
        System.out.println("Pret calculator: " + strategieCalcul.calculeaza(this) + " RON.");
    }

    public int getVarstaSofer() {
        return varstaSofer;
    }

    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public double getValoareVehicul() {
        return valoareVehicul;
    }

    public int getNumarDaune() {
        return numarDaune;
    }

    public String getZonaUtilizare() {
        return zonaUtilizare;
    }
}
