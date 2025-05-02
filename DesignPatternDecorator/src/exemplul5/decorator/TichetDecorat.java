package exemplul5.decorator;

import exemplul5.clase.ITichet;

public abstract class TichetDecorat implements ITichet {
    private ITichet tichet;

    public TichetDecorat(ITichet tichet) {
        this.tichet = tichet;
    }

    @Override
    public void afiseaza() {
        tichet.afiseaza();
        afiseazaOptiune();
    }

    protected abstract void afiseazaOptiune();
}
