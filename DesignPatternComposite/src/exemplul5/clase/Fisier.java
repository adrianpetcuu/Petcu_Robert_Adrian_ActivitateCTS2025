package exemplul5.clase;

public class Fisier implements ElementFisier{
    private String nume;
    private int dimensiune;

    public Fisier(String nume, int dimensiune){
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "- Fisier: " + nume + " (" + dimensiune + " KB).");
    }

    @Override
    public void adaugaNod(ElementFisier elementFisier) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public void stergeNod(ElementFisier elementFisier) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public ElementFisier getNod(int index) throws Exception {
        throw new Exception("Nu este implementata.");
    }
}
