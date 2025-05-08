package program;

import clase.Departament;
import clase.IStructura;
import clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura departament1 = new Departament("Chirurgie");
        IStructura departament2 = new Departament("Cardiologie");
        IStructura departament3 = new Departament("Pediatrie");

        IStructura sectie1 = new Sectie("sectie 1");
        IStructura sectie2 = new Sectie("sectie 2");

        try{
            departament1.adaugaNod(departament2);
            departament1.adaugaNod(departament3);

            departament1.adaugaNod(sectie1);
            departament2.adaugaNod(sectie2);

            departament1.stergeNod(sectie1);
            departament2.adaugaNod(sectie1);

            departament1.descriereStructura();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}