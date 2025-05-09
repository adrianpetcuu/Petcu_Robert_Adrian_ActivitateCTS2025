package exemplul3.clase;

public class Soldat implements ISoldat{
    //date intrinseci nu se schimba de la soldat la soldat
    private String model3D;
    private String textura;
    private String sunet;

    public Soldat(String model3D, String textura, String sunet) {
        this.model3D = model3D;
        this.textura = textura;
        this.sunet = sunet;
    }

    @Override
    public void afiseaza(SoldatExtrinsec soldatExtrinsec) {
        System.out.println("Soldat: " + model3D + ", textura: " + textura + ", sunet: " + sunet +
                " => afisat la coordonatele (" + soldatExtrinsec.getX() + ", " + soldatExtrinsec.getY() + ") cu nume: " + soldatExtrinsec.getNume() + ".");
    }
}
