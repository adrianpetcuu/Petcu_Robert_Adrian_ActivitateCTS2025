package exemplul5.program;

import exemplul5.clase.Caracter;
import exemplul5.clase.FabricaStiluri;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        FabricaStiluri fabricaStiluri = new FabricaStiluri();
        List<Caracter> document = new ArrayList<>();

        document.add(new Caracter(1, 1, fabricaStiluri.getStil('A', "Arial", 12, false)));
        document.add(new Caracter(1, 2, fabricaStiluri.getStil('B', "Arial", 12, false)));
        document.add(new Caracter(1, 3, fabricaStiluri.getStil('C', "Arial", 12, false)));

        document.add(new Caracter(2, 1, fabricaStiluri.getStil('A', "Arial", 12, false)));
        document.add(new Caracter(2, 2, fabricaStiluri.getStil('B', "New Times Roman", 12, true)));

        for(Caracter caracter : document){
            caracter.afiseaza();
        }

        System.out.println("Numar stiluri partajate: " + fabricaStiluri.getNumarStiluri());
    }
}
