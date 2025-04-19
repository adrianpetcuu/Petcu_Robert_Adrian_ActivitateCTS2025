package exemplul3.program;

import exemplul3.clase.AdaptorPlataQR;
import exemplul3.clase.POSFizic;
import exemplul3.clase.PlataQR;
import exemplul3.clase.SistemPlata;

public class Program {
    public static void efectueazaPlata(SistemPlata sistemPlata, double suma){
        sistemPlata.plateste(suma);
    }

    public static void main(String[] args) {
        POSFizic posFizic = new POSFizic();

        PlataQR plataQR = new PlataQR();
        AdaptorPlataQR adaptorPlataQR = new AdaptorPlataQR(plataQR);

        efectueazaPlata(posFizic, 100.0);
        efectueazaPlata(adaptorPlataQR, 150.0);
    }
}
