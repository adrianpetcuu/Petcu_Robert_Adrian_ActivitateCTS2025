package program;

import clase.PacientAbstract;
import clase.Receptie;
import clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        Receptie receptie = new Receptie();

        receptie.getPacient("Ion", "1235", "str. Dorobanti");
        receptie.getPacient("Andreea", "1235", "str. Dorobanti");
        receptie.getPacient("Maria", "1235", "str. Dorobanti");

        Spitalizare spitalizare1 = new Spitalizare(1, 12, 3);
        Spitalizare spitalizare2 = new Spitalizare(1, 13, 5);
        Spitalizare spitalizare3 = new Spitalizare(1, 16, 2);
        Spitalizare spitalizare4 = new Spitalizare(1, 10, 3);

        try {
            receptie.getPacient("Ion").afisareInformatii(spitalizare2);
            receptie.getPacient("Andreea").afisareInformatii(spitalizare4);
            receptie.getPacient("Maria").afisareInformatii(spitalizare1);
            receptie.getPacient("Ion").afisareInformatii(spitalizare3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}