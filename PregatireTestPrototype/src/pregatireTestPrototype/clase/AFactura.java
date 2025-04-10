package pregatireTestPrototype.clase;

public abstract class AFactura {
    protected String numeClient;
    protected double valoare;
    protected String dataEmitere;

    public AFactura(String numeClient, double valoare, String dataEmitere) {
        if(numeClient.length() > 3){
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "Client Anonim";
        }
        this.valoare = valoare > 0 ? valoare : 100;
        this.dataEmitere = dataEmitere.length() == 8 ? dataEmitere : "01.01.24";
    }

    public AFactura(){
        this.numeClient = "Anonim";
        this.valoare = 0;
        this.dataEmitere = "01.02.24";
    }

    public abstract void descriere();
    public abstract AFactura copieaza();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AFactura{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", valoare=").append(valoare);
        sb.append(", dataEmitere='").append(dataEmitere).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
