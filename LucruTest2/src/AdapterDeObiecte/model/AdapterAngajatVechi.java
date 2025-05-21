package AdapterDeObiecte.model;

public class AdapterAngajatVechi implements Angajat{
    private AngajatVechi angajatVechi;

    public AdapterAngajatVechi(AngajatVechi angajatVechi) {
        this.angajatVechi = angajatVechi;
    }

    @Override
    public String getNumeComplet() {
        return angajatVechi.getPrenume() + " " + angajatVechi.getNume();
    }

    @Override
    public String getEmail() {
        return angajatVechi.getEmailPersonal();
    }

    @Override
    public double getSalariu() {
        return angajatVechi.getSalariuLunar();
    }
}
