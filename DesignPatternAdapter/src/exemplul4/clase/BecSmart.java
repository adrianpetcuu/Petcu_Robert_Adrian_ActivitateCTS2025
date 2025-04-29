package exemplul4.clase;

public class BecSmart implements DispozitivSmart{
    private String denumire;

    public BecSmart(String denumire){
        this.denumire = denumire;
    }

    @Override
    public void porneste() {
        System.out.println("Becul inteligent " + denumire + " s-a aprins.");
    }
}
