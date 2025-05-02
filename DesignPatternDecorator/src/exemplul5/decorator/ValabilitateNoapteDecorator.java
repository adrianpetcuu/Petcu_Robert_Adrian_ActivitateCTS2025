package exemplul5.decorator;

import exemplul5.clase.ITichet;

public class ValabilitateNoapteDecorator extends TichetDecorat{

    public ValabilitateNoapteDecorator(ITichet tichet) {
        super(tichet);
    }

    @Override
    protected void afiseazaOptiune() {
        System.out.println(" + Valabilitate extinsa pentru noapte.");
    }
}
