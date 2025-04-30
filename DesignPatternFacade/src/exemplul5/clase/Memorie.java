package exemplul5.clase;

public class Memorie {
    private int capacitateGB;
    private String tip;

    public Memorie(int capacitateGB, String tip){
        this.capacitateGB = capacitateGB;
        this.tip = tip;
    }

    public void verifica(){
        System.out.println("Memorie " + tip + " de " + capacitateGB + "GB este OK.");
    }

    public void opreste(){
        System.out.println("Memoria este eliberata si oprita.");
    }
}
