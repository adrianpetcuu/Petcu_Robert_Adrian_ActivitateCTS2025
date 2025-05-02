package exemplul5.decorator;

import exemplul5.clase.ITichet;

public class VIPDecorator extends TichetDecorat{
    public VIPDecorator(ITichet tichet) {
        super(tichet);
    }

    @Override
    protected void afiseazaOptiune() {
        System.out.println(" + Acces VIP la locuri preferentiale.");
    }
}
