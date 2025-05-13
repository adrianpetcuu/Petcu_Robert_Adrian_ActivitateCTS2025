package exemplul3.clase;

import java.util.List;

public class CompresieRAR implements StrategieCompresie{

    @Override
    public void comprima(String numeArhiva, List<String> fisiere) {
        System.out.println("Se creeaza arhiva RAR: " + numeArhiva + ".rar");
        for(String fisier : fisiere){
            System.out.println(" > Adaugat in RAR: " + fisier);
        }
    }
}
