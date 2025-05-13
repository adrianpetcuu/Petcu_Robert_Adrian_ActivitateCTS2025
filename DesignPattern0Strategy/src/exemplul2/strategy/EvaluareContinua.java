package exemplul2.strategy;

import java.util.List;

public class EvaluareContinua implements StrategieEvaluare{
    @Override
    public double calculeazaNota(List<Double> punctaje) {
        double suma = 0;
        double pondere = 1;
        for(int i = 0; i < punctaje.size(); i++){
            suma += punctaje.get(i) * (i + 1);
            pondere += (i + 1);
        }
        return suma / pondere;
    }

    @Override
    public String descriere() {
        return "Medie ponderata a progresului saptamanal.";
    }
}
