package clase;

public abstract class ARecomandaTransport {
    protected ARecomandaTransport urmator;

    public ARecomandaTransport getUrmator() {
        return urmator;
    }

    public void setUrmator(ARecomandaTransport urmator) {
        this.urmator = urmator;
    }

    public abstract void recomandaTransport(int distanta);
}
