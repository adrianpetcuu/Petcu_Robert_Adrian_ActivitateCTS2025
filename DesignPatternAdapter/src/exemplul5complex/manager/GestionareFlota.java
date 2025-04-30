package exemplul5complex.manager;

import exemplul5complex.modele.VehiculElectric;

import java.util.ArrayList;
import java.util.List;

public class GestionareFlota {
    private List<VehiculElectric> flota = new ArrayList<>();

    public void adaugaVehicul(VehiculElectric vehicul){
        flota.add(vehicul);
        System.out.println("Adaugat vehicul: " + vehicul.getIdentificator());
    }

    public void incarcareTotala(){
        System.out.println("\n=== Incarcam toata flota ===");
        for(VehiculElectric vehicul : flota){
            vehicul.incarca();
        }
    }

    public void pornesteTot(){
        System.out.println("\n=== Pornim toata flota ===");
        for(VehiculElectric vehicul : flota){
            vehicul.porneste();
        }
    }
}
