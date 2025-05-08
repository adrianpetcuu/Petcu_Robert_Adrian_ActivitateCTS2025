package exemplul2.program;

import exemplul2.clase.FabricaDeCamere;
import exemplul2.clase.ICamera;
import exemplul2.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervarePetcu = new Rezervare("Petcu", 3);
        Rezervare rezervarePopescu = new Rezervare("Popescu", 6);
        Rezervare rezervareIonescu = new Rezervare("Ionescu", 2);

        FabricaDeCamere fabricaDeCamere = new FabricaDeCamere();

        ICamera camera = fabricaDeCamere.getCamera(1);
        camera.tiparire(rezervareIonescu);
        fabricaDeCamere.getCamera(1).tiparire(rezervarePopescu);
        fabricaDeCamere.getCamera(2).tiparire(rezervarePetcu);
    }

}
