package exemplul2.clase;

import java.util.ArrayList;
import java.util.List;

public class Manager implements ComponenteOrganizatie{
    private String nume;
    private String functie;
    private List<ComponenteOrganizatie> subordonati;

    public Manager(String nume, String functie){
        this.nume = nume;
        this.functie = functie;
        this.subordonati = new ArrayList<>();
    }


    @Override
    public void afiseazaDetalii() {
        System.out.println("=================");
        System.out.println("Manager: " + nume + " - " + functie + ".");
        for(ComponenteOrganizatie componenteOrganizatie : subordonati){
            componenteOrganizatie.afiseazaDetalii();
        }
    }

    @Override
    public void adaugaNod(ComponenteOrganizatie componenteOrganizatie) throws Exception {
        subordonati.add(componenteOrganizatie);
    }

    @Override
    public void stergeNod(ComponenteOrganizatie componenteOrganizatie) throws Exception {
        subordonati.remove(componenteOrganizatie);
    }

    @Override
    public ComponenteOrganizatie getNod(int index) throws Exception {
        return subordonati.get(index);
    }
}
