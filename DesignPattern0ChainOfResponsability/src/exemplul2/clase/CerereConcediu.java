package exemplul2.clase;

public class CerereConcediu {
    private String angajat;
    private int nrZile;
    private String motiv;

    public CerereConcediu(String angajat, int nrZile, String motiv) {
        this.angajat = angajat;
        this.nrZile = nrZile;
        this.motiv = motiv;
    }

    public String getAngajat() {
        return angajat;
    }

    public int getNrZile() {
        return nrZile;
    }

    public String getMotiv() {
        return motiv;
    }
}
