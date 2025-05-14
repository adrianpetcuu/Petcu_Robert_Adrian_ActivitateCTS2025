package exemplul4.clase;

import java.util.List;

public abstract class GeneratorRaport {
    protected String denumireClient;
    protected List<Double> venituriLunare;

    public GeneratorRaport(String denumireClient, List<Double> venituriLunare){
        this.denumireClient = denumireClient;
        this.venituriLunare = venituriLunare;
    }

    public abstract void colecteazaDate();
    public abstract double calculeazaProfitMedie();
    public abstract String genereazaGrafic(double profit);
    public abstract void exportRaport(String continut);

    public final void genereazaRaport(){
        colecteazaDate();
        double profit = calculeazaProfitMedie();
        String grafic = genereazaGrafic(profit);
        exportRaport(grafic);
    }
}
