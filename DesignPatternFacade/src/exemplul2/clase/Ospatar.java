package exemplul2.clase;

public class Ospatar {
    public void preiaComanda(Comanda comanda){
        System.out.println("Ospatarul a preluat comanda pentru: " +
                comanda.getCantitate() + " x " + comanda.getProdus());
    }
}
