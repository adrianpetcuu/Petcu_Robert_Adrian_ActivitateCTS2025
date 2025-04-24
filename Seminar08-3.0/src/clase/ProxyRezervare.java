package clase;

public class ProxyRezervare implements IRezervare {
    private IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        if(nrPersoane >= 4){
            rezervare.realizeazaRezervare(numeClient, nrPersoane);
        }
        else{
            System.out.println("Nu este nevoie de rezervare.");
        }
    }
}
