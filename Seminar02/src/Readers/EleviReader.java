package Readers;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantiReader {

    public EleviReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            super.readAplicantData(input, elev);

            int clasa = input.nextInt();
            String tutore = input.next();

            elev.setClasa(clasa);
            elev.setTutore(tutore);

            elevi.add(elev);
        }
        input.close();
        return elevi;
    }
}
