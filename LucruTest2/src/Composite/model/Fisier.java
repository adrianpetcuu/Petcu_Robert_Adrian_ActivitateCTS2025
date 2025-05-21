package Composite.model;

public class Fisier implements ComponentaFisiere{
    private String nume;
    private int dimensiune;

    public Fisier(String nume, int dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "- Fisier: " + nume + " (" + dimensiune + "KB)");
    }

    @Override
    public int getDimensiune() {
        return dimensiune;
    }

    @Override
    public void adaugaNod(ComponentaFisiere componentaFisiere) {
        throw new RuntimeException("Nu este implementata");
    }

    @Override
    public void stergeNod(ComponentaFisiere componentaFisiere) {
        throw new RuntimeException("Nu este implementata");
    }

    @Override
    public ComponentaFisiere getNod(int index) {
        throw new RuntimeException("Nu este implementata");
    }
}
