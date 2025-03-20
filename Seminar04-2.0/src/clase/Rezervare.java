package clase;

public class Rezervare extends ARezervare{

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    public Rezervare() {
        super();
    }

    @Override
    public void descriere() {
        System.out.println("Rezervare pentru " + numeClient + " la data de " + data);
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.data = this.data;
        rezervareNoua.ora = this.ora;
        return rezervareNoua;
    }
}
