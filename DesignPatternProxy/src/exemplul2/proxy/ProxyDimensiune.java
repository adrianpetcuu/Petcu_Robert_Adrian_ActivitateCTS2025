package exemplul2.proxy;

import exemplul2.clase.Film;
import exemplul2.clase.IFilm;

public class ProxyDimensiune implements IFilm {
    private Film film;

    public ProxyDimensiune(Film film){
        this.film = film;
    }

    @Override
    public void vizioneaza(String numeUtilizator, String tipAbonament) {
        if(film.getDimensiuneMB() <= 500){
            film.vizioneaza(numeUtilizator, tipAbonament);
        } else{
            System.out.println("Fisierul este prea mare pentru vizionare (peste 500MB).");
        }
    }
}
