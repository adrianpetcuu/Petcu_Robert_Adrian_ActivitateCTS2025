package exemplul2.program;

import exemplul2.clase.Film;
import exemplul2.clase.IFilm;
import exemplul2.proxy.ProxyAcces;
import exemplul2.proxy.ProxyDimensiune;

public class Program {
    public static void main(String[] args) {
        Film filmMic = new Film("Inception", "Sci-Fi", 350);
        Film filmMare = new Film("Avatar 3", "Adventure", 1024);

        IFilm proxyDimensiuneMic = new ProxyDimensiune(filmMic);
        IFilm proxyDimensiuneMare = new ProxyDimensiune(filmMare);

        IFilm proxyCompletMic = new ProxyAcces(proxyDimensiuneMic);
        IFilm proxyCompletMare = new ProxyAcces(proxyDimensiuneMare);

        System.out.println("=== Caz 1: utilizator basic ===");
        proxyCompletMic.vizioneaza("Andrei", "basic");

        System.out.println("=== Caz 2: utilizator premium, film mic ===");
        proxyCompletMic.vizioneaza("Ioana", "premium");

        System.out.println("=== Caz 3: utilizator premium, film mare ===");
        proxyCompletMare.vizioneaza("Maria", "premium");

    }
}
