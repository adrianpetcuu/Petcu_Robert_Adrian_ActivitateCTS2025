package exemplul4.clase;

public class LocExtrinsec {
    //date unice ale fiecarui loc
    //transmise in momentul afisarii, extrinseci
    private int rand;
    private int numar;

    public LocExtrinsec(int rand, int numar) {
        this.rand = rand;
        this.numar = numar;
    }

    public int getRand() {
        return rand;
    }

    public int getNumar() {
        return numar;
    }
}
