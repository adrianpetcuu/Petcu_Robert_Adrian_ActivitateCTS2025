package clase;

import java.util.ArrayList;
import java.util.List;

public class RezervareZborThreadSafe {
    private List<String> locuriRezervate;
    private String codZbor;
    private int locuriDisponibile;

    //instanta statica
    private static RezervareZborThreadSafe instanta;

    //constructor privat
    private RezervareZborThreadSafe(){
        locuriRezervate = new ArrayList<>();
        codZbor = "RO123";
        locuriDisponibile = 50;
    }

    //functie statica care returneaza instanta , la ThreadSafe trebuie sa fie synchronized
    public static synchronized RezervareZborThreadSafe getInstance(){
        if(instanta == null){
            instanta = new RezervareZborThreadSafe();
        }
        return instanta;
    }

    public boolean rezervaLoc(String nume){
        if(locuriDisponibile > 0 && !locuriRezervate.contains(nume)){
            locuriRezervate.add(nume);
            locuriDisponibile--;
            return true;
        }
        return false;
    }

    public boolean anuleazaRezervare(String nume){
        if(locuriRezervate.remove(nume)){
            locuriDisponibile++;
            return true;
        }
        return false;
    }

    public String status(){
        return "Zbor: " + codZbor + ", Locuri disponibile: " + locuriDisponibile;
    }

    public List<String> getListaPasageri(){
        return new ArrayList<>(locuriRezervate);
    }
}
