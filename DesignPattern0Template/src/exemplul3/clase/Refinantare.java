package exemplul3.clase;

public class Refinantare extends ProcesatorDosar{

    public Refinantare(String numeClient) {
        super(numeClient);
    }

    @Override
    public void verificareIdentitate() {
        System.out.println("Validare act identitate si extras credit vechi pentru: " + numeClient);
    }

    @Override
    public void verificareVenituri() {
        System.out.println("Verificare venituri si dovedirea rambursarii anterioare.");
    }

    @Override
    public void verificareGarantii() {
        System.out.println("Preluare garantie existenta din credit refinantat.");
    }

    @Override
    public void evaluareRiscuri() {
        System.out.println("Simulare scenarii refinantare si calcul rata finala.");
    }

    @Override
    public void decizieFinala() {
        System.out.println("Refinantare aprobata si credit anterior inchis.");
    }
}
