package ro.ase.factory;

import ro.ase.clase.Dacia;
import ro.ase.clase.Duster;
import ro.ase.clase.Logan;
import ro.ase.clase.Sandero;

public class DaciaFactory {
    public static Dacia createCar(String model){
        switch(model.toLowerCase()) {
            case "logan":
                return new Logan();
            case "sandero":
                return new Sandero();
            case "duster":
                return new Duster();
            default:
                return null;
        }
    }
}
