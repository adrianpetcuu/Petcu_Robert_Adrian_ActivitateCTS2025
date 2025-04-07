package clase;

public class CursValutarEager {

    private double cursEuro;
    private double cursUsd;
    private String dataActualizare;

    //instanta statica
    private static final CursValutarEager instanta = new CursValutarEager();

    //constructor privat
    private CursValutarEager(){
        this.cursEuro = 4.95;
        this.cursUsd = 4.6;
        this.dataActualizare = "2025-04-07";
    }

    //functie statica care returneaza instanta
    public static CursValutarEager getInstance(){
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CursValutarEager{");
        sb.append("cursEuro=").append(cursEuro);
        sb.append(", cursUsd=").append(cursUsd);
        sb.append(", dataActualizare='").append(dataActualizare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String afiseazaCurs(){
        return "EUR: " + cursEuro + ", USD: " + cursUsd + ", Data: "+ dataActualizare;
    }

    public void actualizeazaCurs(double euro, double usd, String data){
        this.cursEuro = euro;
        this.cursUsd = usd;
        this.dataActualizare = data;
    }

    public double getCurs(String valuta){
        if(valuta.equalsIgnoreCase("EUR")) return cursEuro;
        if(valuta.equalsIgnoreCase("USD")) return cursUsd;
        return -1;
    }
}
