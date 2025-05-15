package exemplul3.clase;

public class InregistrareTranzactie extends Verificator{
    @Override
    public void verifica(Tranzactie tranzactie) {
        System.out.println("[FINAL] Tranzactia de: " + tranzactie.getSuma() + " a fost inregistrata pentru : " + tranzactie.getTitular());
    }
}
