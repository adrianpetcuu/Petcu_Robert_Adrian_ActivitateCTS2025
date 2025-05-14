package exemplul1.clase;

public class ComandaLocala extends ComandaOnline{

    public ComandaLocala(int idComanda) {
        super(idComanda);
    }

    @Override
    public void selecteazaProduse(int id) {
        System.out.println("Produse selectate pentru comanda locala: " + id);
    }

    @Override
    public void calculeazaTransport(int id) {
        System.out.println("Transport local: 15 RON pentru comanda: " + id);
    }

    @Override
    public void proceseazaPlata(int id) {
        System.out.println("Plata cash la livrare pentru comanda: " + id);
    }

    @Override
    public void confirmaLivrare(int id) {
        System.out.println("Comanda locala: " + id + " este in drum spre tine!");
    }
}
