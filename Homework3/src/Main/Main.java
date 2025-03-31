package Main;

import Clase.MasinaSport;
import Registry.MasinaRegistry;

public class Main {
    public static void main(String[] args) {
        MasinaRegistry registry = new MasinaRegistry();

        // Cream o masina sport si o inregistram ca prototip
        MasinaSport loganSport = new MasinaSport("Dacia", "Logan Sport", "Rosu", 150);
        registry.inregistreaza("logan", loganSport);

        // Clonam o masina noua din prototipul inregistrat
        MasinaSport loganNou = (MasinaSport) registry.cloneaza("logan");
        loganNou.setCuloare("Negru");
        loganNou.setCaiPutere(180);

        System.out.println("Original: " + loganSport);
        System.out.println("Clone: " + loganNou);
    }
}
