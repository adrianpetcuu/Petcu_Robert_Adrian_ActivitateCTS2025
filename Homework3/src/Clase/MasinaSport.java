package Clase;

import Clase.Masina;

public class MasinaSport extends Masina {

    private int caiPutere;

    public MasinaSport(String brand, String model, String culoare, int caiPutere) {
        super(brand, model, culoare);
        this.caiPutere = caiPutere;
    }

    public int getCaiPutere() { return caiPutere; }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    @Override
    public Masina clone() {
        return new MasinaSport(this.getBrand(), this.getModel(), this.getCuloare(), this.caiPutere);
    }

    @Override
    public String toString() {
        return super.toString() + ", caiPutere=" + caiPutere;
    }
}
