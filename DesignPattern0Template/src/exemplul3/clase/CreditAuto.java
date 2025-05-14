package exemplul3.clase;

public class CreditAuto extends ProcesatorDosar{

    public CreditAuto(String numeClient) {
        super(numeClient);
    }

    @Override
    public void verificareIdentitate() {
        System.out.println("Verificare CNP si permis de conducere pentru: " + numeClient);
    }

    @Override
    public void verificareVenituri() {
        System.out.println("Calcul venituri nete + contract de munca activ.");
    }

    @Override
    public void verificareGarantii() {
        System.out.println("Verificare valoare masina si RCA.");
    }

    @Override
    public void evaluareRiscuri() {
        System.out.println("Scor risc auto calculat.");
    }

    @Override
    public void decizieFinala() {
        System.out.println("Credit auto aprobat cu limita de 50.000 RON.");
    }
}
