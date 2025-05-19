package model7_strategy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrategieInteractiva implements ICautare{

    @Override
    public List<Produs> cauta(List<Produs> produse) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Culoare: ");
        String culoare = scanner.nextLine();
        System.out.println("Pret maxim: ");
        double pretMax = Double.parseDouble(scanner.nextLine());
        System.out.println("Marime: ");
        String marime = scanner.nextLine();

        List<Produs> rezultate = new ArrayList<>();
        for(Produs produs : produse){
            if(produs.getCuloare().equalsIgnoreCase(culoare) &&
                produs.getPret() <= pretMax && produs.getMarime().equalsIgnoreCase(marime)){
                rezultate.add(produs);
            }
        }
        return rezultate;
    }
}
