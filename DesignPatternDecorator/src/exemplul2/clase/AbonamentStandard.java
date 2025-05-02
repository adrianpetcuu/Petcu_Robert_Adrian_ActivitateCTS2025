package exemplul2.clase;

public class AbonamentStandard implements IAbonament{
    private String numeClient;
    private double pretBaza;

    public AbonamentStandard(String numeClient, double pretBaza){
        this.numeClient = numeClient;
        this.pretBaza = pretBaza;
    }

    @Override
    public void descriere() {
        System.out.println("Abonament standard pentru: " + numeClient + ". Pret de baza: " + pretBaza + " lei.");
    }

    @Override
    public double getPret() {
        return pretBaza;
    }
}
