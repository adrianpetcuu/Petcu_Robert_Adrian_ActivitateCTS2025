package exemplul5.clase;

public class CalculCASCO implements StrategieCalcul{
    @Override
    public double calculeaza(PolitaAsigurare politaAsigurare) {
        double valoareVehicul = politaAsigurare.getValoareVehicul();
        double numarDaune = politaAsigurare.getNumarDaune();
        String zonaUtilizare = politaAsigurare.getZonaUtilizare();

        double cost = valoareVehicul * 0.05;
        if(numarDaune > 0){
            cost += 200 * numarDaune;
        }
        if(zonaUtilizare.equalsIgnoreCase("urban")) {
            cost *= 1.2;
        }
        return cost;
    }

    @Override
    public String descriere() {
        return "Calcul CASCO: 5% din valoare + penalizari daune + zona urbana.";
    }
}
