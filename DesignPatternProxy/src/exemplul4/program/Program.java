package exemplul4.program;

import exemplul4.clase.IServer;
import exemplul4.clase.Server;
import exemplul4.proxy.ProxyOraAcces;
import exemplul4.proxy.ProxyRol;

public class Program {
    public static void main(String[] args) {
        String[] roluriPermise = {"admin", "developer"};
        Server server = new Server("Server Central", roluriPermise);
        System.out.println("=== SERVER FARA PROXY ===");
        server.conecteaza("Nicolae Nica", "ospatar", 23);

        //proxy 1 - verificare rol
        IServer proxyRol = new ProxyRol(server);
        IServer proxyComplet = new ProxyOraAcces(proxyRol);

        System.out.println();
        System.out.println("=== PROXY ROL ===");
        System.out.println("=== Caz 1: Rol valid ===");
        proxyRol.conecteaza("Vlad Mihai", "admin", 20);

        System.out.println("=== Caz 2: Rol invalid ===");
        proxyRol.conecteaza("Adrian Petcu", "salahor", 22);

        //proxy 2 - verificare ora - peste proxy rol

        System.out.println();
        System.out.println("==== PROXY COMPLET ===");

        System.out.println("=== Caz 1: Rol valid, ora valida ===");
        proxyComplet.conecteaza("Ion Popescu", "developer", 10);

        System.out.println("=== Caz 2: Rol invalid ===");
        proxyComplet.conecteaza("Ana Ionescu", "guest", 11);

        System.out.println("=== Caz 3: Ora invalida ===");
        proxyComplet.conecteaza("Maria Georgescu", "admin", 20);

    }
}
