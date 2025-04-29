package exemplu5complex.clasice;

public class TrotinetaClasica {
    private String cod;

    public TrotinetaClasica(String cod){
        this.cod = cod;
    }

    public void pornireManuala(){
        System.out.println("Trotineta clasica " + cod + " poneste manual.");
    }

    public String getCod(){
        return cod;
    }
}
