package Flyweight.main;


import Flyweight.model.DateUniceMasina;
import Flyweight.model.MasinaFactory;
import Flyweight.model.MasinaFlyweight;

public class Program {
    public static void main(String[] args) {

        MasinaFactory masinaFactory = new MasinaFactory();
        MasinaFlyweight m1 = masinaFactory.getMasina("Dacia", "Logan", "alb");
        m1.afiseaza(new DateUniceMasina("B-123-XYZ", "A1"));

        MasinaFlyweight m2 = masinaFactory.getMasina("Dacia", "Logan", "alb");
        m2.afiseaza(new DateUniceMasina("B-456-XYZ", "A2"));

        MasinaFlyweight m3 = masinaFactory.getMasina("Tesla", "Model 3", "negru");
        m3.afiseaza(new DateUniceMasina("CJ-999-TES", "B1"));

        MasinaFlyweight m4 = masinaFactory.getMasina("Dacia", "Logan", "alb");
        m4.afiseaza(new DateUniceMasina("AG-777-BBB", "A3"));
    }
}
