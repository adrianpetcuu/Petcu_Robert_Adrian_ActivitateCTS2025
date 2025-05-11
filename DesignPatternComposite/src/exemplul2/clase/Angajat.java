package exemplul2.clase;

public class Angajat implements ComponenteOrganizatie{
    private String nume;
    private String functie;

    public Angajat(String nume, String functie) {
        this.nume = nume;
        this.functie = functie;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Angajat: " + nume + " - " + functie + ".");
    }

    @Override
    public void adaugaNod(ComponenteOrganizatie componenteOrganizatie) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public void stergeNod(ComponenteOrganizatie componenteOrganizatie) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public ComponenteOrganizatie getNod(int index) throws Exception{
        throw new Exception("Nu este implementata.");
    }
}
