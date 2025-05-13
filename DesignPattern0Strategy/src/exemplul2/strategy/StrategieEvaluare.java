package exemplul2.strategy;

import java.util.List;

public interface StrategieEvaluare {
    double calculeazaNota(List<Double> punctaje);
    String descriere();
}
