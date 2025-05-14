package exemplul1.clase;

public abstract class ComandaOnline {
    protected int idComanda;

    public ComandaOnline(int idComanda){
        this.idComanda = idComanda;
    }

    public abstract void selecteazaProduse(int id);
    public abstract void calculeazaTransport(int id);
    public abstract void proceseazaPlata(int id);
    public abstract void confirmaLivrare(int id);

    public final void proceseazaComanda(){
        selecteazaProduse(idComanda);
        calculeazaTransport(idComanda);
        proceseazaPlata(idComanda);
        confirmaLivrare(idComanda);
    }
}
