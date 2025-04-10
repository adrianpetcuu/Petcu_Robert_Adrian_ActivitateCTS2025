package clase;

public class ContBancar {
    private final String titular;
    private final String iban;
    private final String tipCont;
    private final boolean areCard;
    private final double dobanda;

    protected ContBancar(String titular, String iban, String tipCont, boolean areCard, double dobanda) {
        this.titular = titular;
        this.iban = iban;
        this.tipCont = tipCont;
        this.areCard = areCard;
        this.dobanda = dobanda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("titular='").append(titular).append('\'');
        sb.append(", iban='").append(iban).append('\'');
        sb.append(", tipCont='").append(tipCont).append('\'');
        sb.append(", areCard=").append(areCard);
        sb.append(", dobanda=").append(dobanda);
        sb.append('}');
        return sb.toString();
    }
}
