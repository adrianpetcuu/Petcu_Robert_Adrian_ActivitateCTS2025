package ro.ase.pregatire.clase;

public class Tramvai extends MijlocTransport{
    private int numarVagoane;

    public Tramvai(String sofer, boolean esteFunctional, int numarVagoane) {
        super(sofer, esteFunctional);
        this.numarVagoane = numarVagoane;
    }

    @Override
    public void afiseazaDetalii() {
        if(getEsteFunctional()){
            System.out.println("Acesta este un tramvai condus de soferul " + getSofer() + ". Tramvai este functional si are " + numarVagoane + " vagoane.");
        } else{
            System.out.println("Acesta este un tramvai condus de soferul " + getSofer() + ". Tramvai nu este functional si are " + numarVagoane + " vagoane.");
        }
    }
}
