package Strategy.model;

import java.util.List;

public class Sortator {
    private StrategieSortare strategieSortare;

    public void setStrategieSortare(StrategieSortare strategieSortare){
        this.strategieSortare = strategieSortare;
    }

    public void sorteazaLista(List<Integer> lista){
        if(strategieSortare == null){
            System.out.println("Nicio strategie de sortare selectata!");
            return;
        }
        strategieSortare.sorteaza(lista);
    }
}
