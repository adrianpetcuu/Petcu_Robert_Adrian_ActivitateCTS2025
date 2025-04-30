package exemplul5.clase;

public class Facade implements ICalculator{
    private Procesor procesor;
    private Memorie memorie;
    private PlacaVideo placaVideo;

    public Facade(){
        this.procesor = new Procesor("Intel i7-12700k", 3.6);
        this.memorie = new Memorie(32, "DDR5");
        this.placaVideo = new PlacaVideo("NVIDIA RTX 3080", 10);
    }


    @Override
    public void pornesteCalculator() {
        System.out.println("=== PORNIRE CALCULATOR ===");
        procesor.initializeaza();
        memorie.verifica();
        placaVideo.porneste();
        System.out.println("Calculatorul a pornit cu succes!");
    }

    @Override
    public void opresteCalculator() {
        System.out.println("=== OPRIRE CALCULATOR ===");
        procesor.opreste();
        memorie.opreste();
        placaVideo.opreste();
        System.out.println("Calculatorul s-a oprit complet!");
    }
}
