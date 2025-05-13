package exemplul3.clase;

import java.util.List;

public class Compresie7z implements StrategieCompresie{
    @Override
    public void comprima(String numeArhiva, List<String> fisiere) {
        System.out.println("Se creeaza arhiva 7z: " + numeArhiva + ".7z");
        for(String fisier : fisiere){
            System.out.println(fisier);
        }
    }
}
