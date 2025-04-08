package ro.ase.pregatire.fabrici;

import ro.ase.pregatire.clase.Masina;

public interface FabricaMasini {
    Masina creareMasina(TipMasina tipMasina, String marca, double pret);
}
