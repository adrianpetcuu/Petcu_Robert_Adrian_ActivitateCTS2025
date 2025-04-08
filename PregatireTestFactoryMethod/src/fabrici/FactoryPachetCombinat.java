package fabrici;

import clase.CarteCombinata;
import clase.PachetDigital;

public class FactoryPachetCombinat implements PachetDigitalFactory{

    @Override
    public PachetDigital crearePachet(TipPachetDigital tip) {
        return switch(tip){
            case TipPachetCombinat.COMBO_BASIC -> new CarteCombinata("Combo simplu", 80, 30);
            case TipPachetCombinat.COMBO_EXTINS -> new CarteCombinata("Combo extins", 250, 90);
            default -> null;
        };
    }
}
