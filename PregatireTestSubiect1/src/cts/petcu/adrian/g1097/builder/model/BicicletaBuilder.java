package cts.petcu.adrian.g1097.builder.model;

public class BicicletaBuilder implements IBicicleta{

    private int diametruRoti;
    private String tipFrana;
    private boolean cascaProtectie;
    private boolean ochelari;

    public BicicletaBuilder() {
        diametruRoti = 26;
        tipFrana = "V-brake";
        cascaProtectie = false;
        ochelari = false;
    }

    public BicicletaBuilder setDiametruRoti(int diametruRoti) {
        this.diametruRoti = diametruRoti;
        return this;
    }


    public BicicletaBuilder setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    public BicicletaBuilder setCascaProtectie(boolean cascaProtectie) {
        this.cascaProtectie = cascaProtectie;
        return this;
    }

    public BicicletaBuilder setOchelari(boolean ochelari) {
        this.ochelari = ochelari;
        return this;
    }


    @Override
    public Bicicleta build() {
        return new Bicicleta(diametruRoti, tipFrana, cascaProtectie, ochelari);
    }
}
