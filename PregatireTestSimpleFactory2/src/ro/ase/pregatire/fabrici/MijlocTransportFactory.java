package ro.ase.pregatire.fabrici;

import ro.ase.pregatire.clase.Autobuz;
import ro.ase.pregatire.clase.Metrou;
import ro.ase.pregatire.clase.MijlocTransport;
import ro.ase.pregatire.clase.Tramvai;

public class MijlocTransportFactory {
    public MijlocTransport creareMijlocTransport(TipMijlocTransport tipMijlocTransport){
        return switch(tipMijlocTransport){
            case AUTOBUZ -> new Autobuz("Adrian Petcu", true, 8);
            case TRAMVAI -> new Tramvai("Mihai Popescu", false, 3);
            case METROU -> new Metrou("Valentin Padure", true, 6);
            default -> null;
        };
    }
}
