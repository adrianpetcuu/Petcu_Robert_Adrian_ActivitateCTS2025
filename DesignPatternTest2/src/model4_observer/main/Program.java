package model4_observer.main;

import model4_observer.model.*;

public class Program {
    public static void main(String[] args) {
        IClient client1 = new ClientMultiplu("Adrian Petcu", "0794494321", "adi.petcu2016@gmail.com");
        IClient client2 = new ClientSMS("Cristian Piedone", "0764224223", "piedone@bucuresti.com");
        IClient client3 = new ClientEmail("Donald Trump", "0763942292", "trump@america.usa");

        Subject magazinOnline = new MagazinOnline("Magazin online");
        magazinOnline.aboneazaClient(client1);
        magazinOnline.aboneazaClient(client2);
        magazinOnline.aboneazaClient(client3);

        ((MagazinOnline) magazinOnline).reducereAplicata();

        System.out.println();
        System.out.println();
        magazinOnline.dezaboneazaClient(client2);
        ((MagazinOnline) magazinOnline).reducereAplicata();
    }
}
