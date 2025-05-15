package exemplul3.clase;

public class VerificareLimitaZilnica extends Verificator{
    private static final double LIMITA = 20000.00;
    @Override
    public void verifica(Tranzactie tranzactie) {
        if((tranzactie.getSuma() + tranzactie.getTotalZilnic()) > LIMITA){
            System.out.println("[Eroare] Limita zilnica depasita pentru: " + tranzactie.getTitular());
        } else if(getUrmatorul() != null){
            getUrmatorul().verifica(tranzactie);
        }
    }
}
