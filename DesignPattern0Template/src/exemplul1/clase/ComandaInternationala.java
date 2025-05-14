package exemplul1.clase;

public class ComandaInternationala extends ComandaOnline{

    public ComandaInternationala(int idComanda) {
        super(idComanda);
    }

    @Override
    public void selecteazaProduse(int id) {
        System.out.println("Produse alese pentru export in comanda: " + id);
    }

    @Override
    public void calculeazaTransport(int id) {
        System.out.println("Transport international: 100 RON + taxe vamale pentru comanda: " + id);
    }

    @Override
    public void proceseazaPlata(int id) {
        System.out.println("Plata online procesata in valuta pentru comanda: " + id);
    }

    @Override
    public void confirmaLivrare(int id) {
        System.out.println("Comanda internationala: " + id + " urmeaza sa fie livrata prin curier international.");
    }
}
