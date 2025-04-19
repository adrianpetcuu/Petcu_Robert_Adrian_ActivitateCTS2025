package exemplul1.program;

import exemplul1.clase.AdaptorPlataPayPal;
import exemplul1.clase.Plata;
import exemplul1.clase.PlataCard;
import exemplul1.clase.PlataPayPal;

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