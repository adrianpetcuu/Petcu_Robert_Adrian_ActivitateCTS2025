package clase;

public class AdaptorPlataPayPal implements Plata {

    private PlataPayPal plataPayPal;

    public AdaptorPlataPayPal(PlataPayPal plataPayPal){
        this.plataPayPal = plataPayPal;
    }

    @Override
    public void plateste(float suma) {
        plataPayPal.trimitePlata(suma);
    }
}
