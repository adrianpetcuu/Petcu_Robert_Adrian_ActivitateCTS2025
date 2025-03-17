package Readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantiReader{

    public AngajatiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat aplicant = new Angajat();
            super.readAplicantData(input2, aplicant);

            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            aplicant.setSalariu(salariu);
            aplicant.setOcupatie(ocupatie);
        }
        input2.close();
        return angajati;
    }
}
