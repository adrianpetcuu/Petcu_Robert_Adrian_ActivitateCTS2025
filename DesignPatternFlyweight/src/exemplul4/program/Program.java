package exemplul4.program;

import exemplul1.clase.Loc;
import exemplul4.clase.FabricaLocuri;
import exemplul4.clase.ITipLoc;
import exemplul4.clase.LocExtrinsec;

public class Program {
    public static void main(String[] args) {
        FabricaLocuri fabricaLocuri = new FabricaLocuri();

        ITipLoc vip = fabricaLocuri.getTipLoc("VIP");
        ITipLoc standard = fabricaLocuri.getTipLoc("Standard");
        ITipLoc premium = fabricaLocuri.getTipLoc("Premium");

        vip.afiseazaLoc(new LocExtrinsec(1, 1));
        vip.afiseazaLoc(new LocExtrinsec(1, 2));
        premium.afiseazaLoc(new LocExtrinsec(2, 5));
        premium.afiseazaLoc(new LocExtrinsec(2, 6));
        standard.afiseazaLoc(new LocExtrinsec(3, 10));
        standard.afiseazaLoc(new LocExtrinsec(4, 12));

        System.out.println("Numar tipuri de locuri partajate: " + fabricaLocuri.getNumarTipuriLocuri());
    }
}
