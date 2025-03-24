package ro.ase.main;

import ro.ase.clase.Dacia;
import ro.ase.factory.DaciaFactory;

public class Main {
    public static void main(String[] args) {
        Dacia masina1 = DaciaFactory.createCar("logan");
        Dacia masina2 = DaciaFactory.createCar("sandero");
        Dacia masina3 = DaciaFactory.createCar("duster");
        Dacia masina4 = DaciaFactory.createCar("nu stiu");
        // nu trebuie sa stim cum se creeaza fiecare model
        // daca apare un model nou il adaugam doar in factory
        // logica separata clara intre logica de creare si folosirea obiectelor
        masina1.showInfo();
        masina2.showInfo();
        masina3.showInfo();
        // masina4.showInfo();

    }
}