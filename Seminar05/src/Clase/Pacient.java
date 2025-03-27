package Clase;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCameara;
    private boolean areHalat;
    private String numeInsotitor;

    protected Pacient(String nume, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciDeCameara, boolean areHalat, String numeInsotitor) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciDeCameara = arePapuciDeCameara;
        this.areHalat = areHalat;
        this.numeInsotitor = numeInsotitor;
    }

    protected void setNume(String nume){
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    protected void setArePapuciDeCameara(boolean arePapuciDeCameara) {
        this.arePapuciDeCameara = arePapuciDeCameara;
    }

    protected void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    protected void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume=").append(nume);
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", arePapuciDeCameara=").append(arePapuciDeCameara);
        sb.append(", areHalat=").append(areHalat);
        sb.append(", numeInsotitor='").append(numeInsotitor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
