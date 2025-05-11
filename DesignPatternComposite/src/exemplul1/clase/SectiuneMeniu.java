package exemplul1.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements ComponentaMeniu{
    private String titlu;
    private List<ComponentaMeniu> componente;

    public SectiuneMeniu(String titlu){
        this.titlu = titlu;
        this.componente = new ArrayList<ComponentaMeniu>();
    }

    @Override
    public void afiseaza() {
        System.out.println("=== " + titlu + " ===");
        for(ComponentaMeniu componenta : componente){
            componenta.afiseaza();
        }
    }

    @Override
    public void adaugaNod(ComponentaMeniu componentaMeniu) {
        componente.add(componentaMeniu);
    }

    @Override
    public void stergeNod(ComponentaMeniu componentaMeniu) {
        componente.remove(componentaMeniu);
    }

    @Override
    public ComponentaMeniu getNod(int index) {
        return componente.get(index);
    }
}
