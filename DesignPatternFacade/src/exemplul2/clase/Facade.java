package exemplul2.clase;

public class Facade {
    private Bucatar bucatar;
    private Ospatar ospatar;
    private SistemGestiune sistemGestiune;

    public Facade(){
        this.bucatar = new Bucatar();
        this.ospatar = new Ospatar();
        this.sistemGestiune = new SistemGestiune();
    }

    public void plaseazaComanda(Comanda comanda){
        if(bucatar.poatePrepara(comanda)){
            ospatar.preiaComanda(comanda);
            sistemGestiune.inregistreazaComanda(comanda);
            System.out.println("Comanda a fost acceptata.");
        }
        else{
            System.out.println("Comanda este prea mare. Nu poate fi preparata.");
        }
    }
}
