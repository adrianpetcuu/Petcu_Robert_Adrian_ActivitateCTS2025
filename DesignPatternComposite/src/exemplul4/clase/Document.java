package exemplul4.clase;

import java.util.ArrayList;
import java.util.List;

public class Document implements ElementDocument{
    private String titlu;
    private List<ElementDocument> continut;

    public Document(String titlu){
        this.titlu = titlu;
        continut = new ArrayList<>();
    }
    @Override
    public void afiseaza(int nivel) {
        System.out.println("Document: " + titlu);
        for(ElementDocument elementDocument : continut){
            elementDocument.afiseaza(nivel + 1);
        }
    }

    @Override
    public void adaugaNod(ElementDocument elementDocument) throws Exception {
        continut.add(elementDocument);
    }

    @Override
    public void stergeNod(ElementDocument elementDocument) throws Exception {
        continut.remove(elementDocument);
    }

    @Override
    public ElementDocument getNod(int index) throws Exception {
        return continut.get(index);
    }
}
