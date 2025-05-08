package exemplul2.program;

import exemplul2.clase.AdaptorYouTubePlayer;
import exemplul2.clase.MP3Player;
import exemplul2.clase.Player;
import exemplul2.clase.YouTubePlayer;

public class Program {

    public static void reda(Player player, String fisier){
        player.play(fisier);
    }

    public static void main(String[] args) {
        Player mp3 = new MP3Player();
        YouTubePlayer yt = new YouTubePlayer();
        Player adaptorYt = new AdaptorYouTubePlayer(yt);

        reda(mp3, "melodie.mp3");
        reda(adaptorYt, "documentar_interesant");
    }
}
