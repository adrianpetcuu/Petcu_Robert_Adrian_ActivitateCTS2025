package clase;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String, PacientAbstract> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<String, PacientAbstract>();
    }

    public int getNumarPacienti(){
        return pacienti.size();
    }

    public Pacient getPacient(String nume, String numarTelefon, String adresa){
        if(!pacienti.containsKey(nume)) {
            pacienti.put(nume, new Pacient(nume, numarTelefon, adresa));
            return (Pacient) pacienti.get(nume);
        }
        return (Pacient) pacienti.get(nume);
    }

    public Pacient getPacient(String nume) throws Exception {
        if(pacienti.containsKey(nume)) {
            return (Pacient) pacienti.get(nume);
        }
        else {
            throw new Exception("Nu s-a gasit pacientul.");
        }
    }


}
