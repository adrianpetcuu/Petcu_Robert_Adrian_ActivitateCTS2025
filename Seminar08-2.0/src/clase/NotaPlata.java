package clase;

public class NotaPlata implements Nota{
    private float total;

    public NotaPlata(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public void printare() {
        System.out.println("Total de plata: " + total);
    }
}
