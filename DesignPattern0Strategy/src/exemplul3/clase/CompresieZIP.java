package exemplul3.clase;

import java.util.List;

public class CompresieZIP implements StrategieCompresie{
    @Override
    public void comprima(String numeArhiva, List<String> fisiere) {
        System.out.println("Se creeaza arhiva ZIP: " + numeArhiva + ".zip");
        for(String fisier : fisiere){
            System.out.println(" > Adaugat in ZIP: " + fisier);
        }
    }
}
