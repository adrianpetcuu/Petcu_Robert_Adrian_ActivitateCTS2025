package exemplul5complex.modele;

public class TrotinetaElectrica implements VehiculElectric{
    private String id;

    public TrotinetaElectrica(String id){
        this.id = id;
    }

    @Override
    public void incarca() {
        System.out.println("Trotineta " + id + " se incarca la statie.");
    }

    @Override
    public void porneste() {
        System.out.println("Trotineta " + id + " a fost pornita.");
    }

    @Override
    public String getIdentificator() {
        return id;
    }
}
