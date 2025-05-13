package exemplul5.clase;

public class CalculPremium implements StrategieCalcul{
    @Override
    public double calculeaza(PolitaAsigurare politaAsigurare) {
        return politaAsigurare.getValoareVehicul() * 0.08 + 500;
    }

    @Override
    public String descriere() {
        return "Premium: 8% din valoare + pachet complet servicii.";
    }
}
