package exemplul1.program;

import exemplul1.clase.*;

public class Program {
    public static void main(String[] args) {

        Sala sala = new Sala(true);
        PersonalSala personalSala = new PersonalSala(true);

        Facade facade = new Facade(sala, personalSala);

        Client client1 = new Client("Maria", new Bilet(true, true));
        Client client2 = new Client("Ion", new Bilet(false, true));
        Client client3 = new Client("Ana", new Bilet(true, false));

        System.out.println(facade.permiteAcces(client1));
        System.out.println(facade.permiteAcces(client2));
        System.out.println(facade.permiteAcces(client3));
    }
}
