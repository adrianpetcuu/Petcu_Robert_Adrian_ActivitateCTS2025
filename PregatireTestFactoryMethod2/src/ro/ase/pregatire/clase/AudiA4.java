package ro.ase.pregatire.clase;

public class AudiA4 extends Masina{
    private String model;
    private double capacitateCilindrica;

    public AudiA4(String marca, double pret, String model, double capacitateCilindrica) {
        super(marca, pret);
        this.model = model;
        this.capacitateCilindrica = capacitateCilindrica;
    }


    @Override
    public void afiseazaDetalii() {
        System.out.println("Aceasta masina este un " + getMarca() + " " + model + ", are un motor de " + capacitateCilindrica + " cm3 si este listata la pretul de " + getPret() + "euro.");
    }
}
