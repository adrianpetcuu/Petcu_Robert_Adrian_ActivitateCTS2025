package AdapterDeObiecte.main;

import AdapterDeObiecte.model.AdapterAngajatVechi;
import AdapterDeObiecte.model.Angajat;
import AdapterDeObiecte.model.AngajatVechi;

public class Program {
    public static void main(String[] args) {
        AngajatVechi angajatVechi = new AngajatVechi("Maria", "Ionescu", "maria.ionescu@gmail.com", 4000);
        Angajat adapterAngajatVechi = new AdapterAngajatVechi(angajatVechi);

        System.out.println("Nume complet: " + adapterAngajatVechi.getNumeComplet());
        System.out.println("Email: " + adapterAngajatVechi.getEmail());
        System.out.println("Salariu: " + adapterAngajatVechi.getSalariu() + " RON");
    }
}