package exemplul5.clase;

public class PlacaVideo {
    private String model;
    private int memorieGB;

    public PlacaVideo(String model, int memorieGB){
        this.model = model;
        this.memorieGB = memorieGB;
    }

    public void porneste(){
        System.out.println("Placa video " + model + " cu " + memorieGB + "GB se initializeaza.");
    }

    public void opreste(){
        System.out.println("Placa video " + model + " a fost oprita.");
    }
}
