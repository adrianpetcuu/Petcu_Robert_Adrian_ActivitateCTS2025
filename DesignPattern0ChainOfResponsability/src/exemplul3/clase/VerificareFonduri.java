package exemplul3.clase;

public class VerificareFonduri extends Verificator{
    @Override
    public void verifica(Tranzactie tranzactie) {
        if(tranzactie.getSuma() <= tranzactie.getSoldDisponibil()){
            if(getUrmatorul() != null){
                getUrmatorul().verifica(tranzactie);
            }
        } else{
            System.out.println("[Eroare] Fonduri insuficiente pentru: " + tranzactie.getTitular());
        }
    }
}
