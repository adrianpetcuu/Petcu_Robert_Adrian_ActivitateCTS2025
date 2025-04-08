package ro.ase.pregatire.fabrici;

import ro.ase.pregatire.clase.Masina;
import ro.ase.pregatire.clase.AudiA4;
import ro.ase.pregatire.clase.AudiA7;

import static ro.ase.pregatire.fabrici.ModelAudi.AudiA4;
import static ro.ase.pregatire.fabrici.ModelAudi.AudiA7;


public class FabricaAudi implements FabricaMasini{

    @Override
    public Masina creareMasina(TipMasina tipMasina, String marca, double pret) {
        return switch(tipMasina){
            case AudiA4 -> new AudiA4(marca, pret, "A4", 2.0);
            case AudiA7 -> new AudiA7(marca, pret, "A7", 3.0);
            default -> null;
        };
    }
}
