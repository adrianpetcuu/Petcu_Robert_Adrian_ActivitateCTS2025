package exemplul5complex.program;

import exemplul5complex.clasice.BicicletaClasica;
import exemplul5complex.clasice.TrotinetaClasica;
import exemplul5complex.manager.GestionareFlota;
import exemplul5complex.modele.AdaptorVehiculClasic;
import exemplul5complex.modele.BicicletaElectrica;
import exemplul5complex.modele.TrotinetaElectrica;
import exemplul5complex.modele.VehiculElectric;

public class Program {
    public static void main(String[] args) {
        GestionareFlota flota = new GestionareFlota();

        VehiculElectric bicicletaElectrica = new BicicletaElectrica("BE-987");
        VehiculElectric trotinetaElectrica = new TrotinetaElectrica("TR-100");

        BicicletaClasica bicicletaClasica = new BicicletaClasica("Pegas");
        TrotinetaClasica trotinetaClasica = new TrotinetaClasica("TROT-222");
        VehiculElectric adaptorBicicletaClasica = new AdaptorVehiculClasic(bicicletaClasica);
        VehiculElectric adaptorTrotinetaClasica = new AdaptorVehiculClasic(trotinetaClasica);

        flota.adaugaVehicul(bicicletaElectrica);
        flota.adaugaVehicul(trotinetaElectrica);
        flota.adaugaVehicul(adaptorBicicletaClasica);
        flota.adaugaVehicul(adaptorTrotinetaClasica);

        flota.incarcareTotala();
        flota.pornesteTot();

    }
}
