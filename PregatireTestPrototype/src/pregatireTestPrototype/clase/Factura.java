package pregatireTestPrototype.clase;

public class Factura extends AFactura{

    public Factura(String numeClient, double valoare, String dataEmitere) {
        super(numeClient, valoare, dataEmitere);
    }

    public Factura() {
        super();
    }

    @Override
    public void descriere() {
        System.out.println("Factura emisa pentru clientul " + numeClient + " in valoare de " + valoare + " lei la data de " + dataEmitere + ".");
    }

    @Override
    public AFactura copieaza() {
        Factura facturaNoua = new Factura();
        facturaNoua.numeClient = this.numeClient;
        facturaNoua.valoare = this.valoare;
        facturaNoua.dataEmitere = this.dataEmitere;
        return facturaNoua;
    }
}
