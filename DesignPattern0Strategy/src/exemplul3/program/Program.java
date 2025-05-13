package exemplul3.program;

import exemplul3.clase.Compresie7z;
import exemplul3.clase.CompresieRAR;
import exemplul3.clase.CompresieZIP;
import exemplul3.clase.Compresor;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> fisiere = Arrays.asList("document.txt", "poza.jpg", "slide.pptx");

        Compresor compresor = new Compresor(new CompresieZIP());
        compresor.arhiveaza("backup1", fisiere);

        System.out.println("\nSchimb strategie in RAR:");
        compresor.setStrategieCompresie(new CompresieRAR());
        compresor.arhiveaza("backup2", fisiere);

        System.out.println("\nSchimb strategie in 7z:");
        compresor.setStrategieCompresie(new Compresie7z());
        compresor.arhiveaza("backup3", fisiere);
    }
}
