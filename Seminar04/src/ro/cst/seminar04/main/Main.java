package ro.cst.seminar04.main;
import ro.cst.seminar04.clase.Supa;
import ro.cst.seminar04.factory.Factory;
import ro.cst.seminar04.factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(200, 18);
        Supa supaLegume = factory.getSupa(TipuriSupe.LEGUME, "Bors, legume", 100);
        supaLegume.preparareSupa();
        Supa supaVita = factory.getSupa(TipuriSupe.VITA, "Bors, vita", 150);
        supaVita.preparareSupa();
        Supa supaCiuperci = factory.getSupa(TipuriSupe.CIUPERCI, "Ciuperci", 140);
        supaCiuperci.preparareSupa();
    }
}