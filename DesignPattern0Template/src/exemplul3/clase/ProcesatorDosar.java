package exemplul3.clase;

public abstract class ProcesatorDosar {
    protected String numeClient;

    public ProcesatorDosar(String numeClient){
        this.numeClient = numeClient;
    }

    public abstract void verificareIdentitate();
    public abstract void verificareVenituri();
    public abstract void verificareGarantii();
    public abstract void evaluareRiscuri();
    public abstract void decizieFinala();

    public final void proceseazaDosar(){
        System.out.println("=== Procesare dosar pentru " + numeClient + " ===");
        verificareIdentitate();
        verificareVenituri();
        verificareGarantii();
        evaluareRiscuri();
        decizieFinala();
        System.out.println("=== Final procesare ===\n");
    }

}
