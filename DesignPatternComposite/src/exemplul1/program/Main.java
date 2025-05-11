package exemplul1.program;

import exemplul1.clase.ComponentaMeniu;
import exemplul1.clase.ItemMeniu;
import exemplul1.clase.SectiuneMeniu;

public class Main {
    public static void main(String[] args) {
        ComponentaMeniu supaDePui = new ItemMeniu("Supa de pui", 18.5);
        ComponentaMeniu supaDeGaluste = new ItemMeniu("Supa de galuste", 20.5);
        ComponentaMeniu supaDePerisoare = new ItemMeniu("Supa de perisoare", 21.5);

        ComponentaMeniu apaPlata = new ItemMeniu("Apa plata", 4.5);
        ComponentaMeniu apaMinerala = new ItemMeniu("Apa minerala", 5.2);

        ComponentaMeniu papanas = new ItemMeniu("Papanasi", 12.2);
        ComponentaMeniu ecler = new ItemMeniu("Ecler", 20.4);

        ComponentaMeniu supe = new SectiuneMeniu("Supe");
        ComponentaMeniu ape = new SectiuneMeniu("Ape");
        ComponentaMeniu desert = new SectiuneMeniu("Desert");

        ComponentaMeniu meniuPrincipal = new SectiuneMeniu("Meniu principal");

        try {
            supe.adaugaNod(supaDePui);
            supe.adaugaNod(supaDeGaluste);
            supe.adaugaNod(supaDePerisoare);

            ape.adaugaNod(apaPlata);
            ape.adaugaNod(apaMinerala);

            desert.adaugaNod(papanas);
            desert.adaugaNod(ecler);

            meniuPrincipal.adaugaNod(supe);
            meniuPrincipal.adaugaNod(ape);
            meniuPrincipal.adaugaNod(desert);

            meniuPrincipal.afiseaza();
            System.out.println("===============");
            desert.afiseaza();
            System.out.println("===============");
            apaPlata.afiseaza();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}