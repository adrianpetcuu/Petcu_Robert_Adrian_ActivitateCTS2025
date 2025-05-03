package exemplul5.proxy;

import exemplul5.clase.IAPI;

public class ProxyOraAcces implements IAPI {
    private IAPI api;

    public ProxyOraAcces(IAPI api){
        this.api = api;
    }

    @Override
    public void executaTranzactie(String client, String rol, boolean activ, int ora, double suma) {
        if(ora >= 6 && ora <= 22){
            api.executaTranzactie(client, rol, activ, ora, suma);
        }else{
            System.out.println("Tranzactie refuzata: accesul este permis doar intre orele 6:00 si 22:00.");
        }
    }
}
