package Flyweight.model;

public class DateUniceMasina {
    private String numarInmatriculare;
    private String locParcare;

    public DateUniceMasina(String numarInmatriculare, String locParcare) {
        this.numarInmatriculare = numarInmatriculare;
        this.locParcare = locParcare;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public String getLocParcare() {
        return locParcare;
    }
}
