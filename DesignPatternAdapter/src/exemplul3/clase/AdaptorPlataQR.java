package exemplul3.clase;

public class AdaptorPlataQR implements SistemPlata{
    private PlataQR plataQR;

    public AdaptorPlataQR(PlataQR plataQR){
        this.plataQR = plataQR;
    }

    @Override
    public void plateste(double suma) {
        plataQR.scanAndPay(suma);
    }
}
