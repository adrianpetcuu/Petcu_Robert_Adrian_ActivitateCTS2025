package exemplul1.clase;

public class Bilet {
    private boolean esteValid;
    private boolean estePlatit;

    public Bilet(boolean esteValid, boolean estePlatit){
        this.esteValid = esteValid;
        this.estePlatit = estePlatit;
    }

    public boolean isEsteValid() {
        return esteValid;
    }

    public boolean isEstePlatit(){
        return estePlatit;
    }
}
