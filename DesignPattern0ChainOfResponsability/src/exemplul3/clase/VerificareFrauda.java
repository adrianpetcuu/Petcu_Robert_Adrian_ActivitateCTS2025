package exemplul3.clase;

public class VerificareFrauda extends Verificator{
    @Override
    public void verifica(Tranzactie tranzactie) {
        if(tranzactie.isTranzactieInternationala() && tranzactie.getSuma() > 10000){
            System.out.println("[Eroare] Tranzactie suspecta internationala - raport pentru : " + tranzactie.getTitular());
        } else if(getUrmatorul() != null){
            getUrmatorul().verifica(tranzactie);
        }
    }
}
