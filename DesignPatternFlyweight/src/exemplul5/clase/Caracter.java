package exemplul5.clase;

public class Caracter {
    //contine pozitia unica si referinta la stilul partajat
    private int rand;
    private int coloana;
    private ICaracter stil;

    public Caracter(int rand, int coloana, ICaracter stil) {
        this.rand = rand;
        this.coloana = coloana;
        this.stil = stil;
    }

    public void afiseaza(){
        stil.afiseaza(rand, coloana);
    }
}
