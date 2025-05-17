package model5_strategy.model;

public class Client implements IClient{
    private String numeClient;
    private ModPlata modPlata;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    @Override
    public void efectueazaPlata(double suma) {
        if(modPlata != null){
            modPlata.plateste(numeClient, suma);
        } else {
            System.out.println("[Eroare] Niciun mod de plata setat pentru " + numeClient + ".");
        }
    }

}
