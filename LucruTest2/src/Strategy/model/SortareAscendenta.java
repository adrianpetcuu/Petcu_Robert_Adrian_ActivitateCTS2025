package Strategy.model;

import java.util.Collections;
import java.util.List;

public class SortareAscendenta implements StrategieSortare{
    @Override
    public void sorteaza(List<Integer> lista) {
        Collections.sort(lista);
        System.out.println("Sortare ascendenta: " + lista);
    }
}
