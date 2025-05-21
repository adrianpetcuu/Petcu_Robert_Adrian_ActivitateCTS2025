package Composite.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Folder implements ComponentaFisiere{
    private String nume;
    private List<ComponentaFisiere> continut = new ArrayList<>();

    public Folder(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "+ Folder: " + nume + " (" + getDimensiune() + "KB)");
        for(ComponentaFisiere componentaFisiere : continut){
            componentaFisiere.afiseaza(indentare + " ");
        }
    }

    @Override
    public int getDimensiune() {
        int total = 0;
        for(ComponentaFisiere componentaFisiere : continut){
            total += componentaFisiere.getDimensiune();
        }
        return total;
    }

    @Override
    public void adaugaNod(ComponentaFisiere componentaFisiere) {
        continut.add(componentaFisiere);
    }

    @Override
    public void stergeNod(ComponentaFisiere componentaFisiere) {
        continut.remove(componentaFisiere);
    }

    @Override
    public ComponentaFisiere getNod(int index) {
        return continut.get(index);
    }
}
