package Proxy.model;

public class ProxyDocumentPDF implements Document{
    private String numeFisier;
    private DocumentPDF documentReal;

    public ProxyDocumentPDF(String numeFisier){
        this.numeFisier = numeFisier;
    }

    @Override
    public void afiseaza() {
        if(documentReal == null){
            documentReal = new DocumentPDF(numeFisier);
        }
        documentReal.afiseaza();
    }
}
