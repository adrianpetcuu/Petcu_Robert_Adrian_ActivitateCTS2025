package clase;

public class ContBancarBuilder implements AbstractBuilder{
    //obligatorii
    private final String titular;
    private final String iban;

    //optionale cu valori default
    private String tipCont = "Standard";
    private boolean areCard = false;
    private double dobanda = 0.0;

    public ContBancarBuilder(String titular, String iban){
        this.titular = titular;
        this.iban = iban;
    }

    public ContBancarBuilder setTipCont(String tipCont) {
        this.tipCont = tipCont;
        return this;
    }

    public ContBancarBuilder setAreCard(boolean areCard) {
        this.areCard = areCard;
        return this;
    }

    public ContBancarBuilder setDobanda(double dobanda) {
        this.dobanda = dobanda;
        return this;
    }

    @Override
    public ContBancar build() {
        return new ContBancar(titular, iban, tipCont, areCard, dobanda);
    }
}
