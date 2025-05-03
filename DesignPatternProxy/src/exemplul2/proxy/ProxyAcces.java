package exemplul2.proxy;

import exemplul2.clase.IFilm;

public class ProxyAcces implements IFilm{
    private IFilm film;

    public ProxyAcces(IFilm film){
        this.film = film;
    }

    @Override
    public void vizioneaza(String numeUtilizator, String tipAbonament) {
        if(tipAbonament.equalsIgnoreCase("premium")){
            film.vizioneaza(numeUtilizator, tipAbonament);
        }
        else{
            System.out.println("Acces refuzat. Doar utilizatorii PREMIUM pot viziona acest film.");
        }
    }
}
