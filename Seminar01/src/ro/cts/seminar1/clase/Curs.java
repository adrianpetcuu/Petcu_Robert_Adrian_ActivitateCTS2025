package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPersoana;
import ro.cts.seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public Curs(){
        this.numeCurs = "CTS";
        this.credite = 5;
        cadruDidactic = new Profesor();
        studenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void afisareDetalii() {
        StringBuilder sb = new StringBuilder("La cursul ").append(this.numeCurs).
                append(" cu ").append(this.credite).append(" puncte credit ").
                append(" predat de ").append(((IPersoana)cadruDidactic).getNume()).
                append(" are ").append(studenti.size()).append(" studenti. ");
        System.out.println(sb.toString());
    }

    public void sustineExamen(String data){
        StringBuilder sb = new StringBuilder("Pe data ").append(data).
                append(", cadrul didactic ").append(((IPersoana)this.cadruDidactic).getNume()).
                append(" sustine examenul cu urmatorii studenti: ");
        System.out.println(sb.toString());
        studenti.forEach(s -> System.out.println(s.getNume()));
    }
}
