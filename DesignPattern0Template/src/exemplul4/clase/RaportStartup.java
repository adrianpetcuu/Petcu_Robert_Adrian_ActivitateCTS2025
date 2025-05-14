package exemplul4.clase;

import java.util.List;

public class RaportStartup extends GeneratorRaport{

    public RaportStartup(String denumireClient, List<Double> venituriLunare) {
        super(denumireClient, venituriLunare);
    }

    @Override
    public void colecteazaDate() {
        venituriLunare.removeIf(v -> v<1000);
    }

    @Override
    public double calculeazaProfitMedie() {
        double suma = 0;
        for(double venit : venituriLunare){
            suma += venit;
        }
        return venituriLunare.isEmpty() ? 0 : suma / venituriLunare.size();
    }

    @Override
    public String genereazaGrafic(double profit) {
        return "Startup: " + denumireClient + " are un profit mediu de " + profit + " RON.\n[GRAFIC CU BULE]";
    }

    @Override
    public void exportRaport(String continut) {
        System.out.println("[Salvare JSON] " + continut.replace("\n", " | "));
    }
}
