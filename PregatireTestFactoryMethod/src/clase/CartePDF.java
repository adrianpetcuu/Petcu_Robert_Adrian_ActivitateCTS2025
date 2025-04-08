package clase;

public class CartePDF implements PachetDigital{
    private String titlu;
    private int nrPagini;

    public CartePDF(String titlu, int nrPagini) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Carte PDF: " + titlu + ", pagini: " + nrPagini + ".");
    }
}
