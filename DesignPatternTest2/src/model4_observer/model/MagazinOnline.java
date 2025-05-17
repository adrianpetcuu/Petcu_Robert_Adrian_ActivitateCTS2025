package model4_observer.model;

import java.util.ArrayList;
import java.util.List;

public class MagazinOnline implements Subject{
    private String numeMagazin;
    private List<IClient> listaClienti;

    public MagazinOnline(String numeMagazin) {
        this.numeMagazin = numeMagazin;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void aboneazaClient(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void dezaboneazaClient(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void notificaClienti(String mesaj) {
        for(IClient client : listaClienti){
            client.primesteNotificare(mesaj);
        }
    }

    public void reducereAplicata(){
        notificaClienti("A fost aplicata o reducere de 10% tuturor produselor din magazinul online.");
    }
}
