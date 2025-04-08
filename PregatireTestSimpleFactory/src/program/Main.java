package program;

import clase.ProdusIT;
import factory.ProduseFactory;
import factory.ProduseSingletonFactory;
import factory.TipProdus;

public class Main {
    public static void main(String[] args) {
        //ProduseSingletonFactory fabrica = ProduseSingletonFactory.getInstance();
        //ProdusIT produs = null;
        //try {
        //    produs = fabrica.creareProdus(TipProdus.PRODUS_MONITOR);
        //} catch (Exception e) {
        //    throw new RuntimeException(e);
        //}
        //produs.descriere();

        ProduseFactory fabrica = new ProduseFactory();
        ProdusIT produs = null;
        try {
            produs = fabrica.creareProdus(TipProdus.PRODUS_LAPTOP);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        produs.descriere();
    }
}