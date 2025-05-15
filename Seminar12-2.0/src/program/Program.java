package program;

import clase.AMetrou;
import clase.Metrou;
import clase.MetrouSpecial;

public class Program {
    public static void main(String[] args) {
        AMetrou metrou = new Metrou(1);
        AMetrou metrouSpecial = new MetrouSpecial();

        metrou.circulaTur();
        System.out.println();
        metrou.circulaRetur();
        System.out.println();
        System.out.println();
        System.out.println();
        metrouSpecial.circulaTur();
        System.out.println();
        metrouSpecial.circulaRetur();
        
    }
}