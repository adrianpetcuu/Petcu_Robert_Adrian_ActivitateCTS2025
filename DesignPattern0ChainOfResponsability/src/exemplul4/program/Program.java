package exemplul4.program;

import exemplul4.clase.*;

public class Program {
    public static void main(String[] args) {
        Validare nume = new ValidareNume();
        Validare email = new ValidareEmail();
        Validare parola = new ValidareParola();
        Validare termeni = new ValidareTermeni();
        Validare finalizare = new FinalizareCont();

        nume.setUrmatorul(email);
        email.setUrmatorul(parola);
        parola.setUrmatorul(termeni);
        termeni.setUrmatorul(finalizare);

        Formular formular1 = new Formular("Ion Popescu", "ion@email.com", "parola123", true);
        nume.valideaza(formular1);

        Formular formular2 = new Formular("Ana", "anaemail.com", "parola123", true);
        nume.valideaza(formular2);

        Formular formular3 = new Formular("Adrian", "adrian.com", "parola123", true);
        nume.valideaza(formular3);

        Formular formular4 = new Formular("Mihai", "mihai@gmail.com", "123", true);
        nume.valideaza(formular4);

        Formular formular5 = new Formular("Adriana", "ana@gmail.com", "parola123", false);
        nume.valideaza(formular5);
    }
}
