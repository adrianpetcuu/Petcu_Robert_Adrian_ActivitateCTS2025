package exemplul2.clase;

import exemplul1.clase.AdaptorPlataPayPal;

public class AdaptorYouTubePlayer implements Player{
    private YouTubePlayer youTubePlayer;

    public AdaptorYouTubePlayer(YouTubePlayer youTubePlayer){
        this.youTubePlayer = youTubePlayer;
    }
    @Override
    public void play(String numeFisier) {
        youTubePlayer.streamVideo(numeFisier);
    }
}
