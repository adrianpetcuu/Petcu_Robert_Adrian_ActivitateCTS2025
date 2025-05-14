package exemplul2.program;

import exemplul2.clase.FormularClientInternational;
import exemplul2.clase.FormularPersoanaFizica;
import exemplul2.clase.FormularPersoanaJuridica;
import exemplul2.clase.ValidareFormular;

public class Program {
    public static void main(String[] args) {
        ValidareFormular formularPersoanaFizica = new FormularPersoanaFizica("Mihai Popescu");
        formularPersoanaFizica.validareFormular();
        System.out.println();
        ValidareFormular formularPersoanaJuridica = new FormularPersoanaJuridica("Adrian Petcu");
        formularPersoanaJuridica.validareFormular();
        System.out.println();
        ValidareFormular formularClientInternational = new FormularClientInternational("George Ionescu");
        formularClientInternational.validareFormular();
    }
}
