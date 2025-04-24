package program;

import clase.IRezervare;
import clase.ProxyNumeClient;
import clase.ProxyRezervare;
import clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        ProxyRezervare proxy = new ProxyRezervare(rezervare);

        proxy.realizeazaRezervare("Pop Irina", 2);
        proxy.realizeazaRezervare("Ioana", 4); 

        IRezervare proxyCompus = new ProxyNumeClient(proxy);
        proxyCompus.realizeazaRezervare("Pop Irina", 2);
        proxyCompus.realizeazaRezervare("Pop", 5);
        proxyCompus.realizeazaRezervare("Pop Irina", 5);
    }
}