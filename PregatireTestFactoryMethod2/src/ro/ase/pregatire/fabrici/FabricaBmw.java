package ro.ase.pregatire.fabrici;


import ro.ase.pregatire.clase.BmwM3;
import ro.ase.pregatire.clase.BmwM5;
import ro.ase.pregatire.clase.Masina;

import static ro.ase.pregatire.fabrici.ModelBmw.BmwM5;
import static ro.ase.pregatire.fabrici.ModelBmw.BmwM3;

public class FabricaBmw implements FabricaMasini{

    @Override
    public Masina creareMasina(TipMasina tipMasina, String marca, double pret) {
        return switch(tipMasina){
            case BmwM3 -> new BmwM3(marca, pret, "M3", 330);
            case BmwM5 -> new BmwM5(marca, pret, "M5", 550);
            default -> null;
        };
    }
}
