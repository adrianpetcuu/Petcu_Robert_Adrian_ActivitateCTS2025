package Clase;

public abstract class Masina implements Cloneable {
    private String brand;
    private String model;
    private String culoare;

    public Masina(String brand, String model, String culoare) {
        this.brand = brand;
        this.model = model;
        this.culoare = culoare;
    }

    public abstract Masina clone();

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getCuloare() { return culoare; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setCuloare(String culoare) { this.culoare = culoare; }

    @Override
    public String toString() {
        return "Masina{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
