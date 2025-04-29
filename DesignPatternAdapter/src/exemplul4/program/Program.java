package exemplul4.program;

import exemplul4.clase.AdaptorLampaClasica;
import exemplul4.clase.BecSmart;
import exemplul4.clase.DispozitivSmart;
import exemplul4.clase.LampaClasica;

public class Program {
    public static void activeazaDispozitivul(DispozitivSmart dispozitiv){
        System.out.println("Activare dispozitiv...");
        dispozitiv.porneste();
    }

    public static void main(String[] args) {
        DispozitivSmart becSmart = new BecSmart("Philips Hue");
        activeazaDispozitivul(becSmart);

        LampaClasica lampaClasica = new LampaClasica("Vintage 1980");
        DispozitivSmart adaptorLampaClasica = new AdaptorLampaClasica(lampaClasica);
        activeazaDispozitivul(adaptorLampaClasica);
    }
}
