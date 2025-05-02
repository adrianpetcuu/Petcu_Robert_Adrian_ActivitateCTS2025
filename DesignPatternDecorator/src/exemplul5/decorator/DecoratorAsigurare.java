package exemplul5.decorator;

import exemplul5.clase.ITichet;

public class DecoratorAsigurare extends TichetDecorat{

    public DecoratorAsigurare(ITichet tichet) {
        super(tichet);
    }

    @Override
    protected void afiseazaOptiune() {
        System.out.println(" + Include asigurare importiva daunelor.");
    }
}
