package exemplul4.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ElementDocument{
    private String titlu;
    private List<ElementDocument> subelemente;

    public Sectiune(String titlu){
        this.titlu = titlu;
        this.subelemente = new ArrayList<>();
    }

    @Override
    public void afiseaza(int nivel) {
        String indent = " ".repeat(nivel * 2);
        System.out.println(indent + " Sectiune: " + titlu);
        for(ElementDocument elementDocument: subelemente){
            elementDocument.afiseaza(nivel + 1);
        }
    }

    @Override
    public void adaugaNod(ElementDocument elementDocument) throws Exception {
        subelemente.add(elementDocument);
    }

    @Override
    public void stergeNod(ElementDocument elementDocument) throws Exception {
        subelemente.remove(elementDocument);
    }

    @Override
    public ElementDocument getNod(int index) throws Exception {
        return subelemente.get(index);
    }
}