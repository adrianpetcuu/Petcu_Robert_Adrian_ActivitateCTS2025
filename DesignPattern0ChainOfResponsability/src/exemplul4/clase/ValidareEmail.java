package exemplul4.clase;

public class ValidareEmail extends Validare{
    @Override
    public void valideaza(Formular formular) {
        if(formular.getEmail() != null && formular.getEmail().contains("@")){
            if (getUrmatorul() != null){
                getUrmatorul().valideaza(formular);
            }
        }
        else{
            System.out.println("[Eroare] Adresa de email invalida.");
        }
    }
}
