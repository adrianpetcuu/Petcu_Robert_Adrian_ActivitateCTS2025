package exemplul2.clase;

public class Camera implements ICamera{

    private int codAranjare;
    private int numarProsoape;
    private int numarCearsafuri;
    private int numarPerne;
    private int numarUmerase;

    public Camera(int codAranjare, int numarProsoape, int numarCearsafuri, int numarPerne, int numarUmerase) {
        this.codAranjare = codAranjare;
        this.numarProsoape = numarProsoape;
        this.numarCearsafuri = numarCearsafuri;
        this.numarPerne = numarPerne;
        this.numarUmerase = numarUmerase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("codAranjare=").append(codAranjare);
        sb.append(", numarProsoape=").append(numarProsoape);
        sb.append(", numarCearsafuri=").append(numarCearsafuri);
        sb.append(", numarPerne=").append(numarPerne);
        sb.append(", numarUmerase=").append(numarUmerase);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void tiparire(Rezervare rezervare) {
        System.out.println(this.toString() + " " + rezervare.toString());
    }
}
