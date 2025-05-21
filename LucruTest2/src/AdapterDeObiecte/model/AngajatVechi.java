package AdapterDeObiecte.model;

public class AngajatVechi {
    private String prenume;
    private String nume;
    private String emailPersonal;
    private int salariuLunar;

    public AngajatVechi(String prenume, String nume, String emailPersonal, int salariuLunar){
        this.prenume = prenume;
        this.nume = nume;
        this.emailPersonal = emailPersonal;
        this.salariuLunar = salariuLunar;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public int getSalariuLunar() {
        return salariuLunar;
    }
}
