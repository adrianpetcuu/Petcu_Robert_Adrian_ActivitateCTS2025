package pregatireTestPrototype.program;

import pregatireTestPrototype.clase.AFactura;
import pregatireTestPrototype.clase.Factura;

public class Main {
    public static void main(String[] args) {
        AFactura factura = new Factura("Adrian Petcu SRL", 8550.80, "08.04.25");
        AFactura factura2 = factura.copieaza();
        AFactura factura3 = factura.copieaza();
        factura.descriere();
        factura2.descriere();
        factura3.descriere();
    }
}