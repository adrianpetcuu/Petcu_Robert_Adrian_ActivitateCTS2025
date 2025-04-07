package program;

import clase.ExamManagerEager;
import clase.ExamManagerLazy;
import clase.ExamManagerThreadSafe;

public class Main {
    public static void main(String[] args) {
        ExamManagerEager examenEager = ExamManagerEager.getInstance();
        System.out.println(examenEager.inregistreazaStudent("Andrei"));
        System.out.println(examenEager.inregistreazaStudent("Andrei"));
        ExamManagerEager examenEager1 = ExamManagerEager.getInstance();
        System.out.println(examenEager1.inregistreazaStudent("Andrei"));
        // printeaza "false" pentru ca nu se creeaza o noua instanta
        // e tot cea veche care contine numele

        ExamManagerLazy examenLazy = ExamManagerLazy.getInstance();
        System.out.println();
        System.out.println(examenLazy.inregistreazaStudent("Adrian"));
        System.out.println(examenLazy.inregistreazaStudent("Adrian"));
        ExamManagerLazy examenLazy1 = ExamManagerLazy.getInstance();
        System.out.println(examenLazy1.inregistreazaStudent("Adrian"));


        ExamManagerThreadSafe examenThreadSafe = ExamManagerThreadSafe.getInstance();
        System.out.println();
        System.out.println(examenThreadSafe.inregistreazaStudent("Teodor"));
        System.out.println(examenThreadSafe.inregistreazaStudent("Teodor"));
        ExamManagerThreadSafe examenSafeThread1 = ExamManagerThreadSafe.getInstance();
        System.out.println(examenSafeThread1.inregistreazaStudent("Teodor"));
    }
}