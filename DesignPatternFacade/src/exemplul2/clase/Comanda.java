package exemplul2.clase;

public class Comanda {
    private String produs;
    private int cantitate;

    public Comanda(String produs, int cantitate){
        this.produs = produs;
        this.cantitate = cantitate;
    }

    public String getProdus(){
        return produs;
    }

    public int getCantitate(){
        return cantitate;
    }
}
