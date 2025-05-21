package Facade.model;

public class SistemIT {
    public void creeazaContEmail(String nume){
        System.out.println("Cont de email creat pentru: " + nume.toLowerCase().replace(" ", ".") + "@firma.com");
    }
    public void adaugaInActiveDirectory(String nume){
        System.out.println("Adaugat in Active Directory: " + nume);
    }
}
