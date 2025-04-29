package exemplul4.clase;

public class LampaClasica {
    private String model;

    public LampaClasica(String model){
        this.model = model;
    }

    public void aprinde(){
        System.out.println("Lampa clasica " + model + " a fost aprinsa manual.");
    }
}
