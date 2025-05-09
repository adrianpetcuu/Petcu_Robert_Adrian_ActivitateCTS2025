package exemplul4.clase;

public class TipLoc implements ITipLoc{
    //atribute comune pentru tipul de loc
    //nu se creeaza pentru fiecare loc ci se reutilizeaza
    private String categorie;
    private String culoare;
    private double pret;

    public TipLoc(String categorie, String culoare, double pret) {
        this.categorie = categorie;
        this.culoare = culoare;
        this.pret = pret;
    }

    @Override
    public void afiseazaLoc(LocExtrinsec locExtrinsec) {
        System.out.println("Loc [" + locExtrinsec.getRand() + ", " + locExtrinsec.getNumar() + "] - Categorie: " +
                categorie + ", Culoare: " + culoare + ", Pret: " + pret + " lei.");
    }
}
