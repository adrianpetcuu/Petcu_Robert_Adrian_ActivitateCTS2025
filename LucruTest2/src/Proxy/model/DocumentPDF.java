package Proxy.model;

public class DocumentPDF implements Document{
    private String numeFisier;

    public DocumentPDF(String numeFisier){
        this.numeFisier = numeFisier;
        incarcaDePeDisc();
    }

    public void incarcaDePeDisc(){
        System.out.println("Incarc documentul PDF de pe disc: " + numeFisier);
    }

    @Override
    public void afiseaza() {
        System.out.println("Afisez documentul: " + numeFisier);
    }
}
