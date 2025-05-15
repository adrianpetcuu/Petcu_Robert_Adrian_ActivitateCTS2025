package exemplul4.clase;

public class ValidareTermeni extends Validare{
    @Override
    public void valideaza(Formular formular) {
        if(formular.isTermeniAcceptati()){
            if(getUrmatorul() != null){
                getUrmatorul().valideaza(formular);
            }
        }else{
            System.out.println("[Eroare] Trebuie sa acceptati termenii si conditiile.");
        }
    }
}
