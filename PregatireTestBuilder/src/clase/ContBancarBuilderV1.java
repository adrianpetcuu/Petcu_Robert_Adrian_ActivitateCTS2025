package clase;

public class ContBancarBuilderV1 implements IBuilder{

    private ContBancar contBancar;

    public ContBancarBuilderV1() {
        contBancar = new ContBancar();
    }

    public ContBancarBuilderV1 setDetinator(String detinator) {
        contBancar.setDetinator(detinator);
        return this;
    }

    public ContBancarBuilderV1 setSumaBlocata(double sumaBlocata) {
        contBancar.setSumaBlocata(sumaBlocata);
        return this;
    }

    public ContBancarBuilderV1 setSuma(double suma) {
        contBancar.setSuma(suma);
        return this;
    }

    public ContBancarBuilderV1 setMoneda(String moneda) {
        contBancar.setMoneda(moneda);
        return this;
    }

    public ContBancarBuilderV1 setCardAtasat(boolean cardAtasat) {
        contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBancarBuilderV1 setInternetBanking(boolean internetBanking) {
        contBancar.setInternetBanking(internetBanking);
        return this;
    }

    public ContBancarBuilderV1 setContSalariu(boolean contSalariu) {
        contBancar.setContSalariu(contSalariu);
        return this;
    }

    @Override
    public ContBancar build() {
        return contBancar;
    }
}
