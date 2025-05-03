package exemplul5.program;

import exemplul5.clase.API;
import exemplul5.clase.IAPI;
import exemplul5.proxy.ProxyActiv;
import exemplul5.proxy.ProxyLimitaCereri;
import exemplul5.proxy.ProxyOraAcces;
import exemplul5.proxy.ProxyRolPremium;

public class Program {
    public static void main(String[] args) {
        //obiect real
        IAPI api = new API();

        //proxy compus
        IAPI proxyActiv = new ProxyActiv(api);
        IAPI proxyRolPremium = new ProxyRolPremium(proxyActiv);
        IAPI proxyOraAcces = new ProxyOraAcces(proxyRolPremium);
        IAPI proxyFinal = new ProxyLimitaCereri(proxyOraAcces);

        System.out.println("=== Caz 1: client activ, premium, ora buna, suma mica ===");
        proxyFinal.executaTranzactie("Adrian Petcu", "premium", true, 10, 6000);

        System.out.println("=== Caz 2: client activ, basic, suma mare ===");
        proxyFinal.executaTranzactie("Maria Ionescu", "basic", true, 11, 7000);

        System.out.println("=== Caz 3: client inactiv ===");
        proxyFinal.executaTranzactie("Vasile Georgescu", "premium", false, 12, 1500);

        System.out.println("=== Caz 4: ora incorecta ===");
        proxyFinal.executaTranzactie("Mihai Vasilescu", "premium", true, 23, 1000);

        System.out.println("=== Caz 5: rate limiting (a 4-a cerere) ===");
        proxyFinal.executaTranzactie("Ion Popescu", "premium", true, 10, 500);
        proxyFinal.executaTranzactie("Ion Popescu", "premium", true, 10, 500);
        proxyFinal.executaTranzactie("Ion Popescu", "premium", true, 10, 500);
        proxyFinal.executaTranzactie("Ion Popescu", "premium", true, 10, 500);

    }
}
