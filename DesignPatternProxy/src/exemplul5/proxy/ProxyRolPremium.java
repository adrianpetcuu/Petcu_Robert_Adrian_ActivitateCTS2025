package exemplul5.proxy;

import exemplul5.clase.IAPI;

public class ProxyRolPremium implements IAPI {
    private IAPI api;

    public ProxyRolPremium(IAPI api){
        this.api = api;
    }
    @Override
    public void executaTranzactie(String client, String rol, boolean activ, int ora, double suma) {
        if(suma > 5000 && !rol.equalsIgnoreCase("premium")) {
            System.out.println("Tranzactie refuzata: doar clientii premium pot face tranzactii peste 5000lei.");
        } else {
            api.executaTranzactie(client, rol, activ, ora, suma);
        }
    }
}
