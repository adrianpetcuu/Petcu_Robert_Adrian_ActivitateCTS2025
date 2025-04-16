package program;

import clase.AdaptorPlataPayPal;
import clase.Plata;
import clase.PlataCard;
import clase.PlataPayPal;

public class Main {

    public static void efectueazaPlata(Plata plata, float suma){
        System.out.println("Procesam plata...");
        plata.plateste(suma);
    }

    public static void main(String[] args) {
        Plata plataCard = new PlataCard("1234-5678-9012");
        PlataPayPal plataPayPal = new PlataPayPal("client@paypal.com");

        Plata adaptorPlataPayPal = new AdaptorPlataPayPal(plataPayPal);

        efectueazaPlata(plataCard, 150.0f);
        efectueazaPlata(adaptorPlataPayPal, 250.0f);
    }
}