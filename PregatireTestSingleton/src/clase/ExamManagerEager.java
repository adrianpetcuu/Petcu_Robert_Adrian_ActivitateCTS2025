package clase;

import java.util.ArrayList;
import java.util.List;

public class ExamManagerEager {
    // instanta este creata imeadiat
    private List<String> studentiInregistrati = new ArrayList<>();
    private String materie;
    private int numarMaximStudenti;

    //instanta creata de la inceput
    private static final ExamManagerEager instanta = new ExamManagerEager();

    //constructor privat
    private ExamManagerEager(){
        this.materie = "Programare";
        this.numarMaximStudenti = 100;
    }

    //functie statica care returneaza instanta
    public static ExamManagerEager getInstance(){
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
