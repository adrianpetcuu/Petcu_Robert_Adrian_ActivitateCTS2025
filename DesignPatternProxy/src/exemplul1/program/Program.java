package exemplul1.program;

import exemplul1.clase.PachetTransport;
import exemplul1.clase.PachetTuristic;
import exemplul1.clase.Persoana;
import exemplul1.proxy.ProxyPachetTransport;

public class Program {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Adrian Petcu", 22);
        PachetTuristic pachetTransport = new PachetTransport(persoana);
        pachetTransport.descriere();
        pachetTransport.rezervaPachet();
        System.out.println("---------------------");

        PachetTuristic pachetTransportProxy = new ProxyPachetTransport(persoana);
        pachetTransportProxy.descriere();
        pachetTransportProxy.rezervaPachet();
    }
}
