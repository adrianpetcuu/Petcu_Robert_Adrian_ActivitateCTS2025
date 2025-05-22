package Strategy.model;

import java.util.Collections;
import java.util.List;

public class StrategieAscendenta implements StrategieSortare{
    @Override
    public void sorteaza(List<Integer> lista) {
        Collections.sort(lista);
        System.out.println("Sortare ascendenta: " + lista);
    }
}
