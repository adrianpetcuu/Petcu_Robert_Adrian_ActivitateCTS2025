package ro.ase.pregatire.program;

import ro.ase.pregatire.clase.Masina;
import ro.ase.pregatire.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FabricaBmw fabricaBmw = new FabricaBmw();
        Masina masinaBmwM3 = fabricaBmw.creareMasina(ModelBmw.BmwM3, "BMW", 20000);
        masinaBmwM3.afiseazaDetalii();
        Masina masinaBmwM5 = fabricaBmw.creareMasina(ModelBmw.BmwM5, "BMW", 40000);
        masinaBmwM5.afiseazaDetalii();

        FabricaAudi fabricaAudi = new FabricaAudi();
        Masina masinaAudiA4 = fabricaAudi.creareMasina(ModelAudi.AudiA4, "Audi", 13000);
        masinaAudiA4.afiseazaDetalii();
        Masina masinaAudiA7 = fabricaAudi.creareMasina(ModelAudi.AudiA7, "Audi", 30000);
        masinaAudiA7.afiseazaDetalii();

    }
}