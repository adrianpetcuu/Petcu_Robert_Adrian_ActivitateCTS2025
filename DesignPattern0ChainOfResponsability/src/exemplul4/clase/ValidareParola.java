package exemplul4.clase;

public class ValidareParola extends Validare{
    @Override
    public void valideaza(Formular formular) {
        String parola = formular.getParola();
        if(parola != null && parola.length() >= 8 && parola.matches(".*\\d.*")){
            if(getUrmatorul() != null){
                getUrmatorul().valideaza(formular);
            }
        }
        else{
            System.out.println("[Eroare] Parola trebuie sa aiba cel putin 8 caractere si o cifra.");
        }
    }
}
