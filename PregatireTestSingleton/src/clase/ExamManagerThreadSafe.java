package clase;

import java.util.ArrayList;
import java.util.List;

public class ExamManagerThreadSafe {
    private List<String> studentiInregistrati = new ArrayList<>();
    private String materie;
    private int numarMaximStudenti;

    //instanta
    private static ExamManagerThreadSafe instanta;

    //constructor privat
    private ExamManagerThreadSafe(){
        this.materie = "Programare";
        this.numarMaximStudenti = 100;
    }

    //metoda statica getInstance - SINCRONIZATA pe mai multe fire de executie
    public static synchronized ExamManagerThreadSafe getInstance(){
        if(instanta == null){
            instanta = new ExamManagerThreadSafe();
        }
        return instanta;
    }

    public boolean inregistreazaStudent(String nume){
        if(!studentiInregistrati.contains(nume)){
            studentiInregistrati.add(nume);
            return true;
        }
        return false;
    }
}
