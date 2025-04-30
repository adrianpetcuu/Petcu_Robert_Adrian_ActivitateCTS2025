package exemplul3.clase;

public class Facade {
    private VerificatorActe verificatorActe;
    private PlatiTaxe platiTaxe;
    private BazaDeDate bazaDeDate;

    public Facade(){
        this.verificatorActe = new VerificatorActe();
        this.platiTaxe = new PlatiTaxe();
        this.bazaDeDate = new BazaDeDate();
    }

    public void inmatriculeazaAuto(Client client){
        if(!verificatorActe.verificaActe(client)){
            System.out.println("Clientul " + client.getNume() + " nu are actele complete!");
            return;
        }
        if(!platiTaxe.verificaTaxe(client)){
            System.out.println("Clientul " + client.getNume() + " nu are taxele platite!");
            return;
        }

        bazaDeDate.inregistreaza(client);
        System.out.println("Inmatriculare reusita pentru clientul: " + client.getNume());
    }
}
