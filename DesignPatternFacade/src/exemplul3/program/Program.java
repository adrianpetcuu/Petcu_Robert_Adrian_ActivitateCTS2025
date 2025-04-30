package exemplul3.program;

import exemplul3.clase.Client;
import exemplul3.clase.Facade;

public class Program {
    public static void main(String[] args) {
        Facade facade = new Facade();

        Client client1 = new Client("Adrian Petcu", true, true);
        Client client2 = new Client("Ana Ionescu", false, true);
        Client client3 = new Client("Mihai Georgescu", true, false);

        facade.inmatriculeazaAuto(client1);
        System.out.println("-----------------");
        facade.inmatriculeazaAuto(client2);
        System.out.println("-----------------");
        facade.inmatriculeazaAuto(client3);
    }
}
