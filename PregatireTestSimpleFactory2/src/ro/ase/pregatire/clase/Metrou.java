package ro.ase.pregatire.clase;

public class Metrou extends MijlocTransport{
    private int numarVagoane;

    public Metrou(String sofer, boolean esteFunctional, int numarVagoane) {
        super(sofer, esteFunctional);
        this.numarVagoane = numarVagoane;
    }

    @Override
    public void afiseazaDetalii() {
        if(getEsteFunctional()){
            System.out.println("Acesta este un metrou condus de soferul " + getSofer() + ". Metroul este functional si are " + numarVagoane + " vagoane.");
        } else{
            System.out.println("Acesta este un metrou condus de soferul " + getSofer() + ". Metroul nu este functional si are " + numarVagoane + " vagoane.");
        }
    }
}
