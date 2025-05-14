package exemplul4.clase;

import java.util.List;

public class RaportONG extends GeneratorRaport{
    public RaportONG(String denumireClient, List<Double> venituriLunare) {
        super(denumireClient, venituriLunare);
    }

    @Override
    public void colecteazaDate() {
        venituriLunare.add(2000.0);
    }

    @Override
    public double calculeazaProfitMedie() {
        return venituriLunare.stream().mapToDouble(d -> d).sum() / venituriLunare.size();
    }

    @Override
    public String genereazaGrafic(double profit) {
        return "ONG-ul " + denumireClient + "\nVenit mediu: " + profit + " RON\n[GRAFIC VERDE]";
    }

    @Override
    public void exportRaport(String continut) {
        System.out.println("[Export HTML]\n<html><body>" + continut + "</body></html>");
    }
}
