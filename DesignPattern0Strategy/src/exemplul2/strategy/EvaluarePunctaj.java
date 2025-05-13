package exemplul2.strategy;

import java.util.List;

public class EvaluarePunctaj implements StrategieEvaluare{
    @Override
    public double calculeazaNota(List<Double> punctaje) {
        double total = punctaje.stream().mapToDouble(Double::doubleValue).sum();
        if(total >= 90) return 10;
        if(total >= 80) return 9;
        if(total >= 70) return 8;
        if(total >= 60) return 7;
        if(total >= 50) return 6;
        return 4;
    }

    @Override
    public String descriere() {
        return "Transformare punctaj in nota.";
    }
}
