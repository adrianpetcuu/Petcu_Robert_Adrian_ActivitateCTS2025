package Strategy.model;

import java.util.Collections;
import java.util.List;

public class SortareAleatorie implements StrategieSortare{
    @Override
    public void sorteaza(List<Integer> lista) {
        Collections.shuffle(lista);
        System.out.println("Sortare aleatorie: " + lista);
    }
}
