package exemplu5complex.modele;

public class BicicletaElectrica implements VehiculElectric{
    private String serie;

    public BicicletaElectrica(String serie){
        this.serie = serie;
    }

    @Override
    public void incarca() {
        System.out.println("Bicicleta electrica " + serie + " se incarca la statie.");
    }

    @Override
    public void porneste() {
        System.out.println("Bicicleta electrica " + serie + " a fost pornita.");
    }

    @Override
    public String getIdentificator() {
        return serie;
    }
}
