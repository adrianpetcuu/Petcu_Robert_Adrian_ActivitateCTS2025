package cts.petcu.adrian.g1097.factory.model;

public class FabricaBiciclete {
    public IBicicleta creareBicicleta(TipBicicleta tipBicicleta){
        return switch(tipBicicleta){
            case MTB -> new BicicletaMTB();
            case ELECTRICA -> new BicicletaElectrica();
            case TREKKING -> new BicicletaTrekking();
            default -> null;
        };
    }
}
