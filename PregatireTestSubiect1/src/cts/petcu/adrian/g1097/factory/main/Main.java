package cts.petcu.adrian.g1097.factory.main;

import cts.petcu.adrian.g1097.factory.model.FabricaBiciclete;
import cts.petcu.adrian.g1097.factory.model.IBicicleta;
import cts.petcu.adrian.g1097.factory.model.TipBicicleta;

public class Main {
    public static void main(String[] args) {
        FabricaBiciclete fabrica = new FabricaBiciclete();
        IBicicleta b1 = fabrica.creareBicicleta(TipBicicleta.MTB);
        IBicicleta b2 = fabrica.creareBicicleta(TipBicicleta.TREKKING);
        IBicicleta b3 = fabrica.creareBicicleta(TipBicicleta.ELECTRICA);
        IBicicleta b4 = fabrica.creareBicicleta(TipBicicleta.MTB);
        b1.afiseazaDetalii();
        b2.afiseazaDetalii();
        b3.afiseazaDetalii();
        b4.afiseazaDetalii();
    }
}
