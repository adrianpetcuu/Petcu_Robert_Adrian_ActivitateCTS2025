package exemplul4.clase;

public class FinalizareCont extends Validare{
    @Override
    public void valideaza(Formular formular) {
        System.out.println("[SUCCES] Contul pentru: " + formular.getNume() + " a fost creat cu succes.");
    }
}
