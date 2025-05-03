package exemplul5.proxy;

import exemplul5.clase.IAPI;

import java.util.HashMap;
import java.util.Map;

public class ProxyLimitaCereri implements IAPI {
    private IAPI api;
    private Map<String, Integer> cereriClient = new HashMap<>();

    public ProxyLimitaCereri(IAPI api){
        this.api = api;
    }
    @Override
    public void executaTranzactie(String client, String rol, boolean activ, int ora, double suma) {
        int cereri = cereriClient.getOrDefault(client, 0);
        if(cereri >= 3){
            System.out.println("Tranzactie refuzata: limita de 3 cereri pe zi a fost atinsa de clientul " + client);
        }
        else{
            cereriClient.put(client, cereri + 1);
            api.executaTranzactie(client, rol, activ, ora, suma);
        }
    }
}
