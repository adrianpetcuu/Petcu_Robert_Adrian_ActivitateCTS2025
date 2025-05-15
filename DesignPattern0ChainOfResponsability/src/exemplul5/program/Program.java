package exemplul5.program;

import exemplul5.clase.*;

public class Program {
    public static void main(String[] args) {
        SuportHandler nivel1 = new SuportNivel1();
        SuportHandler nivel2 = new SuportNivel2();
        SuportHandler admin = new AdministratorSistem();
        SuportHandler fallback = new RaspunsAutomat();

        nivel1.setUrmatorul(nivel2);
        nivel2.setUrmatorul(admin);
        admin.setUrmatorul(fallback);

        CerereSuport cerere1 = new CerereSuport("Andrei", "Cum schimb parola?", 1);
        CerereSuport cerere2 = new CerereSuport("Irina", "Aplicatia se blocheaza cand trimit formularul.", 2);
        CerereSuport cerere3 = new CerereSuport("George", "Serverul nu mai porneste.", 3);
        CerereSuport cerere4 = new CerereSuport("Elena", "Cerere neidentificata.", 99);

        nivel1.gestioneazaCerere(cerere1);
        nivel1.gestioneazaCerere(cerere2);
        nivel1.gestioneazaCerere(cerere3);
        nivel1.gestioneazaCerere(cerere4);
    }
}
