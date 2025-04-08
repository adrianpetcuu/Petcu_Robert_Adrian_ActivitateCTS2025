package factory;

import clase.ProdusCombo;
import clase.ProdusIT;
import clase.ProdusLaptop;
import clase.ProdusMonitor;

public class ProduseFactory {
    public ProdusIT creareProdus(TipProdus tipProdus) throws Exception {
        switch(tipProdus){
            case PRODUS_LAPTOP:
                return new ProdusLaptop();
            case PRODUS_MONITOR:
                return new ProdusMonitor();
            case PRODUS_COMBO:
                return new ProdusCombo();
            default:
                throw new Exception("Tipul primit nu este corect.");
        }
    }
}
