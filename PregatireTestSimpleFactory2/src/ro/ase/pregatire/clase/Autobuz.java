package ro.ase.pregatire.clase;

public class Autobuz extends MijlocTransport{
    private int numarRoti;

    public Autobuz(String sofer, boolean esteFunctional, int numarRoti) {
        super(sofer, esteFunctional);
        this.numarRoti = numarRoti;
    }

    @Override
    public void afiseazaDetalii() {
        if(getEsteFunctional()){
            System.out.println("Acesta este un autobuz condus de soferul " + getSofer() + ". Autobuzul este functional si are " + numarRoti + " roti.");
        } else{
            System.out.println("Acesta este un autobuz condus de soferul " + getSofer() + ". Autobuzul nu este functional si are " + numarRoti + " roti.");
        }
    }
}
