package exemplul1.clase;

public class ComandaExpress extends ComandaOnline{

    public ComandaExpress(int idComanda) {
        super(idComanda);
    }

    @Override
    public void selecteazaProduse(int id) {
        System.out.println("Comanda rapida initiata pentru: " + id);
    }

    @Override
    public void calculeazaTransport(int id) {
        System.out.println("Transport express: 30 RON livrare in 24h pentru comanda: " + id);
    }

    @Override
    public void proceseazaPlata(int id) {
        System.out.println("Plata confirmata instant prin card pentru comanda: " + id);
    }

    @Override
    public void confirmaLivrare(int id) {
        System.out.println("Comanda express: " + id + " va fi livrata astazi.");
    }
}
