package exemplul3.clase;

public class CreditIpotecar extends ProcesatorDosar{

    public CreditIpotecar(String numeClient) {
        super(numeClient);
    }

    @Override
    public void verificareIdentitate() {
        System.out.println("Verificare buletin si cazier judiciar pentru: " + numeClient);
    }

    @Override
    public void verificareVenituri() {
        System.out.println("Analiza fisa fiscala si adeverinta de salariu minim 3500 RON.");
    }

    @Override
    public void verificareGarantii() {
        System.out.println("Evaluare imobil propus ca garantie.");
    }

    @Override
    public void evaluareRiscuri() {
        System.out.println("Verificare scor de credit si istoric bancar.");
    }

    @Override
    public void decizieFinala() {
        System.out.println("Credit ipotecar aprobat cu dobanda standard.");
    }
}
