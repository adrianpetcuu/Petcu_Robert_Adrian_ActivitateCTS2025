package exemplul1.clase;

public class ItemMeniu implements ComponentaMeniu{
    private String denumire;
    private double pret;

    public ItemMeniu(String denumire, double pret){
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void afiseaza() {
        System.out.println(denumire + " - " + pret + " RON");
    }

    @Override
    public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
        throw new Exception("NU este implementata.");
    }

    @Override
    public void stergeNod(ComponentaMeniu componentaMeniu) throws Exception {
        throw new Exception("NU este implementata.");
    }

    @Override
    public ComponentaMeniu getNod(int index) throws Exception {
        throw new Exception("NU este implementata.");
    }
}
