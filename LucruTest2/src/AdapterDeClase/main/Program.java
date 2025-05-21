package AdapterDeClase.main;

import AdapterDeClase.model.AdapterAngajatVechi;
import AdapterDeClase.model.Angajat;

public class Program {
    public static void main(String[] args) {
        Angajat angajat = new AdapterAngajatVechi("Vlad", "Georgescu", "vlad.georgescu@gmail.com", 4500);
        System.out.println("Nume complet: " + angajat.getNumeComplet());
        System.out.println("Email: " + angajat.getEmail());
        System.out.println("Salariu: " + angajat.getSalariu() + " RON");

    }
}
