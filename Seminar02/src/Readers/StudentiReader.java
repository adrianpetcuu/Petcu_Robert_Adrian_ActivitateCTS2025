package Readers;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantiReader {

    public StudentiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            super.readAplicantData(input, student);

            int anStudii = input.nextInt();
            String facultate = input.next();

            student.setAnStudii(anStudii);
            student.setFacultate(facultate);

            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
