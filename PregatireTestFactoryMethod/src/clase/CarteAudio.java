package clase;

public class CarteAudio implements PachetDigital{
    private String titlu;
    private int durataMinute;

    public CarteAudio(String titlu, int durataMinute) {
        this.titlu = titlu;
        this.durataMinute = durataMinute;
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Carte Audio: " + titlu + ", durata: " + durataMinute + " minute.");
    }
}
