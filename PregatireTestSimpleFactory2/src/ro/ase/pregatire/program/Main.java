package ro.ase.pregatire.program;

import ro.ase.pregatire.clase.MijlocTransport;
import ro.ase.pregatire.fabrici.MijlocTransportFactory;
import ro.ase.pregatire.fabrici.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransportFactory factory = new MijlocTransportFactory();
        MijlocTransport mijlocTransport = factory.creareMijlocTransport(TipMijlocTransport.AUTOBUZ);
        MijlocTransport mijlocTransport2 = factory.creareMijlocTransport(TipMijlocTransport.TRAMVAI);
        MijlocTransport mijlocTransport3 = factory.creareMijlocTransport(TipMijlocTransport.METROU);
        mijlocTransport.afiseazaDetalii();
        mijlocTransport2.afiseazaDetalii();
        mijlocTransport3.afiseazaDetalii();
    }
}