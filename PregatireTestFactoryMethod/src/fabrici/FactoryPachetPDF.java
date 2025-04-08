package fabrici;

import clase.CartePDF;
import clase.PachetDigital;

public class FactoryPachetPDF implements PachetDigitalFactory{
    @Override
    public PachetDigital crearePachet(TipPachetDigital tip){
        return switch((TipPachetPDF)tip){
            case CARTE_SCURTA -> new CartePDF("Poveste scurta", 50);
            case CARTE_LUNGA -> new CartePDF("Roman complet", 300);
        };
    }
}
