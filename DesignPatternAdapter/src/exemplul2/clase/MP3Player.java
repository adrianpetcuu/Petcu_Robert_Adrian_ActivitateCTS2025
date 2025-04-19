package exemplul2.clase;

public class MP3Player implements Player{
    @Override
    public void play(String numeFisier) {
        System.out.println("Redare MP3: " + numeFisier);
    }
}
