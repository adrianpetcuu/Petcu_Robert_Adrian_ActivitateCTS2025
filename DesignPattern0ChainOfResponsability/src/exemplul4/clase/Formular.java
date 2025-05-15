package exemplul4.clase;

public class Formular {
    private String nume;
    private String email;
    private String parola;
    private boolean termeniAcceptati;

    public Formular(String nume, String email, String parola, boolean termeniAcceptati) {
        this.nume = nume;
        this.email = email;
        this.parola = parola;
        this.termeniAcceptati = termeniAcceptati;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public String getParola() {
        return parola;
    }

    public boolean isTermeniAcceptati() {
        return termeniAcceptati;
    }
}
