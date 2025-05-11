package exemplul3.clase;

public class Produs implements StructuraSite {
    private String denumire;
    private double pret;

    public Produs(String denumire, double pret){
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void afiseaza(int indentare) {
        String indent = " ".repeat(indentare);
        System.out.println(indent + "- Produs: " + denumire + " | Pret: " + pret + " RON.");
    }

    @Override
    public void adaugaNod(StructuraSite structuraSite) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public void stergeNod(StructuraSite structuraSite) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public StructuraSite getNod(int index) throws Exception {
        throw new Exception("Nu este implementata.");
    }
}
