package exemplul4.clase;

import java.util.Collections;
import java.util.List;

public class RaportCompanieMare extends GeneratorRaport{
    public RaportCompanieMare(String denumireClient, List<Double> venituriLunare) {
        super(denumireClient, venituriLunare);
    }

    @Override
    public void colecteazaDate() {
        Collections.sort(venituriLunare);
    }

    @Override
    public double calculeazaProfitMedie() {
        return venituriLunare.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    @Override
    public String genereazaGrafic(double profit) {
        return "Companie: " + denumireClient + "\nPROFIT MEDIU: " + profit + " RON\n[=== GRAFIC ===]";
    }

    @Override
    public void exportRaport(String continut) {
        System.out.println("[Export PDF] \n" + continut);
    }
}
