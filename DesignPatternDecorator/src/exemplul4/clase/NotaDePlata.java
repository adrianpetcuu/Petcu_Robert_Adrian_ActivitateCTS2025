package exemplul4.clase;

public class NotaDePlata implements INota{
    private int nrMasa;
    private double total;

    public NotaDePlata(int nrMasa, double total) {
        this.nrMasa = nrMasa;
        this.total = total;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota pentru masa: " + nrMasa + ", total: " + total + " lei.");
    }

    @Override
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
