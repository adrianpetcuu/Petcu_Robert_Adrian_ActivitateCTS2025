package clase;

public class CarteCombinata implements PachetDigital{
    private String titlu;
    private int pagini;
    private int durataAudio;

    public CarteCombinata(String titlu, int pagini, int durataAudio) {
        this.titlu = titlu;
        this.pagini = pagini;
        this.durataAudio = durataAudio;
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Pachet Combinat: " + titlu + ", pagini: " + pagini + ", audio: " + durataAudio + " minute.");
    }
}
