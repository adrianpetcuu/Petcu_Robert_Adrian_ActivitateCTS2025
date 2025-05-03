package exemplul5.proxy;

import exemplul5.clase.API;
import exemplul5.clase.IAPI;

public class ProxyActiv implements IAPI {
    private IAPI api;

    public ProxyActiv(IAPI api) {
        this.api = api;
    }

    @Override
    public void executaTranzactie(String client, String rol, boolean activ, int ora, double suma) {
        if(activ){
            api.executaTranzactie(client, rol, activ, ora, suma);
        }
        else{
            System.out.println("Tranzactie refuzata: contul nu este activ.");
        }
    }
}
