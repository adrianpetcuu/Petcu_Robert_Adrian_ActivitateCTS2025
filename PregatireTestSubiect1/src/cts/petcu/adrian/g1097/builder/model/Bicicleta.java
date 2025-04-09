package cts.petcu.adrian.g1097.builder.model;

public class Bicicleta {
    private int diametruRoti;
    private String tipFrana;
    private boolean cascaProtectie;
    private boolean ochelari;

    protected Bicicleta(int diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari) {
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.cascaProtectie = cascaProtectie;
        this.ochelari = ochelari;
    }

    protected void setDiametruRoti(int diametruRoti) {
        this.diametruRoti = diametruRoti;
    }


    protected void setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
    }

    protected void setCascaProtectie(boolean cascaProtectie) {
        this.cascaProtectie = cascaProtectie;
    }

    protected void setOchelari(boolean ochelari) {
        this.ochelari = ochelari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append("diametruRoti=").append(diametruRoti);
        sb.append(", tipFrana='").append(tipFrana).append('\'');
        sb.append(", cascaProtectie=").append(cascaProtectie);
        sb.append(", ochelari=").append(ochelari);
        sb.append('}');
        return sb.toString();
    }
}
