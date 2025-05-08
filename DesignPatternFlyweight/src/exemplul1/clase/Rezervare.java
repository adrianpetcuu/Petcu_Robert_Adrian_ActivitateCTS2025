package exemplul1.clase;

public class Rezervare {
    //clasa simpla care contine datele UNICE pentru fiecare rezervare
    private int rand;
    private int numarLoc;
    private String numePersoana;

    public Rezervare(int rand, int numarLoc, String numePersoana) {
        this.rand = rand;
        this.numarLoc = numarLoc;
        this.numePersoana = numePersoana;
    }

    public int getRand() {
        return rand;
    }

    public int getNumarLoc() {
        return numarLoc;
    }

    public String getNumePersoana() {
        return numePersoana;
    }
}
