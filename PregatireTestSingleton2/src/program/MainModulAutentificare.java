package program;

import clase.ModulAutentificareLazy;

public class MainModulAutentificare {
    public static void main(String[] args) {
        ModulAutentificareLazy modulAutentificare = ModulAutentificareLazy.getInstance();

        System.out.println("Autentificat: " + modulAutentificare.esteAutentificat());
        modulAutentificare.autentifica("ana.pop");
        System.out.println("Utilizator: " + modulAutentificare.getUtilizator());
        System.out.println("Token: " + modulAutentificare.getToken());
        System.out.println("Autentificat: " + modulAutentificare.esteAutentificat());
        ModulAutentificareLazy modulAutentificare2 = ModulAutentificareLazy.getInstance();
        modulAutentificare2.autentifica("adi.petcu");
        System.out.println("Utilizator: " + modulAutentificare.getUtilizator());
        System.out.println("Token: " + modulAutentificare.getToken());
        System.out.println("Autentificat: " + modulAutentificare.esteAutentificat());

        modulAutentificare2.delogare();
        System.out.println("Utilizator: " + modulAutentificare.getUtilizator());
        System.out.println("Token: " + modulAutentificare.getToken());
        System.out.println("Autentificat: " + modulAutentificare.esteAutentificat());
    }
}
