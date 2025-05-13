package exemplul2.program;

import exemplul2.strategy.EvaluareClasica;
import exemplul2.strategy.EvaluareContinua;
import exemplul2.strategy.EvaluarePunctaj;
import exemplul2.strategy.Student;

public class Program {
    public static void main(String[] args) {
        System.out.println("\nStrategie (Evaluare Clasica): ");
        Student student = new Student("Andrei", new EvaluareClasica());
        student.adaugaPunctaj(8.5);
        student.adaugaPunctaj(9.0);
        student.afiseazaNotaFinala();

        System.out.println("\nSchimbare strategie (Evaluare Punctaj): ");
        student.setStrategieEvaluare(new EvaluarePunctaj());
        student.adaugaPunctaj(10);
        student.afiseazaNotaFinala();

        System.out.println("\nSchimbare strategie (Evaluare Continua): ");
        Student student2 = new Student("Ioana", new EvaluareContinua());
        student2.adaugaPunctaj(6.5);
        student2.adaugaPunctaj(7.0);
        student2.adaugaPunctaj(8.0);
        student2.adaugaPunctaj(9.5);
        student2.afiseazaNotaFinala();
    }
}
