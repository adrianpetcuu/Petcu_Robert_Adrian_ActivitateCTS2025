package exemplul5.clase;

import java.util.ArrayList;
import java.util.List;

public class Folder implements ElementFisier{
    private String nume;
    private List<ElementFisier> continut;

    public Folder(String nume){
        this.nume = nume;
        this.continut = new ArrayList<>();
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + " Director: " + nume);
        for(ElementFisier elementFisier : continut){
            elementFisier.afiseaza(indentare + "   ");
        }
    }

    @Override
    public void adaugaNod(ElementFisier elementFisier) throws Exception {
        continut.add(elementFisier);
    }

    @Override
    public void stergeNod(ElementFisier elementFisier) throws Exception {
        continut.remove(elementFisier);
    }

    @Override
    public ElementFisier getNod(int index) throws Exception {
        return continut.get(index);
    }
}
