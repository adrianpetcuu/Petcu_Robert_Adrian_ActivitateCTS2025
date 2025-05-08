package exemplul1.program;

import exemplul1.clase.FabricaDeLocuri;
import exemplul1.clase.ILoc;
import exemplul1.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        // intr-un stadion sunt mii de locuri, fiecare loc are: sector, tipScaun(VIP, normal)
        // fiecare rezervare are date unice: rand, numarLoc, numePersoana;
        // nu vrem sa cream cate un obiect intreg pentru fiecare loc
        // folosim Flyweight pentru sector si tipScaun

        FabricaDeLocuri fabricaDeLocuri = new FabricaDeLocuri();

        ILoc locVIP1 = fabricaDeLocuri.getLoc("A", "VIP");
        ILoc locVIP2 = fabricaDeLocuri.getLoc("A", "VIP");

        ILoc locNormal = fabricaDeLocuri.getLoc("B", "Normal");

        Rezervare rezervare1 = new Rezervare(1, 10, "Popescu Ion");
        Rezervare rezervare2 = new Rezervare(1, 11, "Ionescu Maria");
        Rezervare rezervare3 = new Rezervare(5, 20, "Georgescu Mihai");

        locVIP1.afiseazaDetalii(rezervare1);
        locVIP2.afiseazaDetalii(rezervare2);
        locNormal.afiseazaDetalii(rezervare3);

        System.out.println("Numar instante unice de Loc: " + fabricaDeLocuri.getNumarLocuriUnice());

        //separare clasa a datelor intrinseci / extrinseci
        //obiectele Loc sunt partajate -> salvam in memorie
        //folosim Fabrica pentru a evita duplicarea instantelor

        //date comune - partajate
        //date unice - externe , pasate la apel
        //fabrica evita instantele duplicate
        //scalabilitate - pot avea 10.000 rezervari si doar cateva obiecte Loc
    }
}
