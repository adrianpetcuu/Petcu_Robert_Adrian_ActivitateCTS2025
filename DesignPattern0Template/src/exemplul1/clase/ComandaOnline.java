package exemplul1.clase;

public abstract class ComandaOnline {
    protected int idComanda;

    public ComandaOnline(int idComanda){
        this.idComanda = idComanda;
    }

    protected abstract void selecteazaProduse(int id);
    protected abstract void calculeazaTransport(int id);
    protected abstract void proceseazaPlata(int id);
    protected abstract void confirmaLivrare(int id);

    public final void proceseazaComanda(){
        selecteazaProduse(idComanda);
        calculeazaTransport(idComanda);
        proceseazaPlata(idComanda);
        confirmaLivrare(idComanda);
    }
}
