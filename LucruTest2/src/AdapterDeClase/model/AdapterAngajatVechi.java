package AdapterDeClase.model;

public class AdapterAngajatVechi extends AngajatVechi implements Angajat{

    public AdapterAngajatVechi(String prenume, String nume, String emailPersonal, int salariuLunar) {
        super(prenume, nume, emailPersonal, salariuLunar);
    }

    @Override
    public String getNumeComplet() {
        return getPrenume() + " " + getNume();
    }

    @Override
    public String getEmail() {
        return getEmailPersonal();
    }

    @Override
    public double getSalariu() {
        return getSalariuLunar();
    }
}
