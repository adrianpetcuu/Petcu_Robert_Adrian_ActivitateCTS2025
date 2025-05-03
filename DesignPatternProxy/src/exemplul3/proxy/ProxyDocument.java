package exemplul3.proxy;

import exemplul3.clase.Document;
import exemplul3.clase.IDocument;

public class ProxyDocument implements IDocument {
    private Document document;

    public ProxyDocument(Document document) {
        this.document = document;
    }

    @Override
    public void citeste(String numeAngajat, String grad) {
        if(document.getNivelConfidentialitate().equalsIgnoreCase("confidential") && !grad.equalsIgnoreCase("manager")){
            System.out.println("Acces refuzat! Doar managerii pot citi documente confidentiale.");
        } else {
            document.citeste(numeAngajat, grad);
        }
    }
}
