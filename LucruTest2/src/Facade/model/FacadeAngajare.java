package Facade.model;

public class FacadeAngajare implements ProcesAngajare{
    private final VerificatorCV verificatorCV;
    private final VerificatorLegal verificatorLegal;
    private final SistemIT sistemIT;

    public FacadeAngajare() {
        this.verificatorCV = new VerificatorCV();
        this.verificatorLegal = new VerificatorLegal();
        this.sistemIT = new SistemIT();
    }

    @Override
    public void angajeazaCandidat(String nume) {
        System.out.println("\n=== Proces de angajare pentru: " + nume + " ===");
        if(!verificatorCV.verifica(nume)){
            System.out.println("Eroare: CV invalid.");
            return;
        }
        if(verificatorLegal.areCazier(nume)){
            System.out.println("Eroare: candidat are probleme legale.");
            return;
        }

        sistemIT.creeazaContEmail(nume);
        sistemIT.adaugaInActiveDirectory(nume);
        System.out.println("Angajare finalizata cu succes pentru: " + nume);
    }
}
