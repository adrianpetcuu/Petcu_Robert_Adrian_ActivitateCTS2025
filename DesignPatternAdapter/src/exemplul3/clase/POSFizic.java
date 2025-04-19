package exemplul3.clase;

public class POSFizic implements SistemPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("Plata procesata prin POS fizic: " + suma + " lei.");
    }
}
