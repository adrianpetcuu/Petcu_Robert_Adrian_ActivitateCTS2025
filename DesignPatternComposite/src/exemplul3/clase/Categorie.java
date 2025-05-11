package exemplul3.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraSite{
    private String numeCategorie;
    private List<StructuraSite> subelemente;

    public Categorie(String numeCategorie){
        this.numeCategorie = numeCategorie;
        this.subelemente = new ArrayList<>();
    }
    @Override
    public void afiseaza(int indentare) {
        String indent = " ".repeat(indentare);
        System.out.println(indent + "Categorie: " + numeCategorie);
        for(StructuraSite structuraSite: subelemente){
            structuraSite.afiseaza(indentare + 4);
        }
    }

    @Override
    public void adaugaNod(StructuraSite structuraSite) throws Exception {
        subelemente.add(structuraSite);
    }

    @Override
    public void stergeNod(StructuraSite structuraSite) throws Exception {
        subelemente.remove(structuraSite);
    }

    @Override
    public StructuraSite getNod(int index) throws Exception {
        return subelemente.get(index);
    }
}
