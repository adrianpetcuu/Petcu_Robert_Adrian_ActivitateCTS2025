package exemplul5.clase;

public class TichetSimplu implements ITichet{
    private String numeClient;
    private float tarif;

    public TichetSimplu(String numeClient, float tarif) {
        this.numeClient = numeClient;
        this.tarif = tarif;
    }

    public float getTarif(){
        return tarif;
    }

    @Override
    public void afiseaza() {
        System.out.println("Tichet pentru: " + numeClient + ", tarif: " + tarif + " lei.");
    }
}
