package exemplul2.strategy;

import java.util.List;

public class EvaluareClasica implements StrategieEvaluare{
    @Override
    public double calculeazaNota(List<Double> punctaje) {
        if(punctaje.size() < 2) return 0;
        return (punctaje.get(0) + punctaje.get(1)) / 2; // test + proiect
    }

    @Override
    public String descriere() {
        return "Media dintre test si proiect.";
    }
}
