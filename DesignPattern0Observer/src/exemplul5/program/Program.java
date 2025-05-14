package exemplul5.program;

import exemplul5.clase.SenzorUrgenta;
import exemplul5.clase.SistemAlerta;
import exemplul5.client.Asistent;
import exemplul5.client.DispecerSMURD;
import exemplul5.client.Doctor;
import exemplul5.client.ServiciuAmbulanta;

public class Program {
    public static void main(String[] args) {
        SenzorUrgenta senzorUrgenta = new SenzorUrgenta();
        senzorUrgenta.adaugaObserver(new Asistent());
        senzorUrgenta.adaugaObserver(new Doctor());

        SistemAlerta sistemAlerta = new SistemAlerta();
        sistemAlerta.adaugaObserver(new DispecerSMURD());
        sistemAlerta.adaugaObserver(new ServiciuAmbulanta());

        senzorUrgenta.adaugaObserver(sistemAlerta);
        senzorUrgenta.declanseaza("cod rosu", "Camera 3");
    }
}
