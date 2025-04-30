package exemplul5.clase;

public class Procesor {
    private String model;
    private double frecventaGHz;

    public Procesor(String model, double frecventaGHz){
        this.model = model;
        this.frecventaGHz = frecventaGHz;
    }

    public void initializeaza(){
        System.out.println("Procesorul " + model + " la " + frecventaGHz + " GHz s-a initializat.");
    }

    public void opreste(){
        System.out.println("Procesorul " + model + " se opreste.");
    }
}
