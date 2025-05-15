package exemplul4.clase;

public class ValidareNume extends Validare{

    @Override
    public void valideaza(Formular formular) {
        if(formular.getNume() != null && formular.getNume().trim().length() >= 5){
            if(getUrmatorul() != null){
                getUrmatorul().valideaza(formular);
            }
        }
        else {
            System.out.println("[Eroare] Numele este invalid sau prea scurt.");
        }
    }
}
