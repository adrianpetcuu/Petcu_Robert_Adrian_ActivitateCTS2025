package Strategy.model;

import java.util.Collections;
import java.util.List;

public class SortareDescendenta implements StrategieSortare{
    @Override
    public void sorteaza(List<Integer> lista) {
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Sortare descendenta: " + lista);
    }
}
