package exemplul4.clase;

public class AdaptorLampaClasica implements DispozitivSmart{
    private LampaClasica lampaClasica;

    public AdaptorLampaClasica(LampaClasica lampaClasica){
        this.lampaClasica = lampaClasica;
    }

    @Override
    public void porneste() {
        lampaClasica.aprinde();
    }
}
