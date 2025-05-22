package Strategy.main;

import Strategy.model.SortareAleatorie;
import Strategy.model.SortareDescendenta;
import Strategy.model.SortareAscendenta;
import Strategy.model.Sortator;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 1, 8, 3, 2);

        Sortator sortator = new Sortator();

        sortator.setStrategieSortare(new SortareAscendenta());
        sortator.sorteazaLista(lista);

        sortator.setStrategieSortare(new SortareDescendenta());
        sortator.sorteazaLista(lista);

        sortator.setStrategieSortare(new SortareAleatorie());
        sortator.sorteazaLista(lista);
    }
}
