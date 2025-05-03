package exemplul2.clase;

public class Film implements IFilm{
    private String titlu;
    private String gen;
    private int dimensiuneMB;

    public Film(String titlu, String gen, int dimensiuneMB) {
        this.titlu = titlu;
        this.gen = gen;
        this.dimensiuneMB = dimensiuneMB;
    }

    public int getDimensiuneMB() {
        return dimensiuneMB;
    }

    @Override
    public void vizioneaza(String numeUtilizator, String tipAbonament) {
        System.out.println("Utilizatorul: " + numeUtilizator + " vizioneaza filmul: " +
                titlu + " (" + gen + ", " + dimensiuneMB + "MB).");
    }
}
