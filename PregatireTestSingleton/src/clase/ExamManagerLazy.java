package clase;

import java.util.ArrayList;
import java.util.List;

public class ExamManagerLazy {
    //instanta este creata la prima utilizare
    private List<String> studentiInregistrati = new ArrayList<>();
    private String materie;
    private int numarMaximStudenti;

    //instanta
    public static ExamManagerLazy instanta;

    //constructor privat
    private ExamManagerLazy() {
        this.materie = "Programare";
        this.numarMaximStudenti = 100;
    }

    public static ExamManagerLazy getInstance(){
        if(instanta == null){
            instanta = new ExamManagerLazy();
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
