package exemplul2.strategy;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private List<Double> punctaje;
    private StrategieEvaluare strategieEvaluare;

    public Student(String nume, StrategieEvaluare strategieEvaluare){
        this.nume = nume;
        this.strategieEvaluare = strategieEvaluare;
        this.punctaje = new ArrayList<Double>();
    }

    public void adaugaPunctaj(double valoare){
        this.punctaje.add(valoare);
    }

    public void setStrategieEvaluare(StrategieEvaluare strategieEvaluare){
        this.strategieEvaluare = strategieEvaluare;
    }

    public void afiseazaNotaFinala(){
        System.out.println("Student: " + nume);
        System.out.println("Strategie: " + strategieEvaluare.descriere());
        System.out.println("Nota finala: " + strategieEvaluare.calculeazaNota(punctaje));
    }
}
