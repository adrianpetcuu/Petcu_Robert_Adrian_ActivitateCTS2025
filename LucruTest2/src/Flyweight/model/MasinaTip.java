package Flyweight.model;

public class MasinaTip implements MasinaFlyweight{
    private String marca;
    private String model;
    private String culoare;

    public MasinaTip(String marca, String model, String culoare) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
    }

    @Override
    public void afiseaza(DateUniceMasina date) {
        System.out.println("Masina [" + marca + " " + model + ", "+ culoare + "] cu numar: " +
                date.getNumarInmatriculare() + " pe locul: " + date.getLocParcare());
    }
}
