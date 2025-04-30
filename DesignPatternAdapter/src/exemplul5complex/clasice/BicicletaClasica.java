package exemplul5complex.clasice;

public class BicicletaClasica {
    private String marca;

    public BicicletaClasica(String marca){
        this.marca = marca;
    }

    public void pedaleaza(){
        System.out.println("Pedalezi bicicleta clasica marca " + marca +".");
    }

    public String getMarca(){
        return marca;
    }
}
