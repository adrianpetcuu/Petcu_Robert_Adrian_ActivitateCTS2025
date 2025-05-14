package exemplul2.program;

import exemplul2.clase.ContBancar;
import exemplul2.client.AuditLog;
import exemplul2.client.ClientFidel;
import exemplul2.client.Observer;
import exemplul2.client.SMSNotifier;

public class Program {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar("RO49AAAA24MMGFOGF3453S", 1000);

        Observer clientFidel = new ClientFidel("Andrei");
        Observer auditLog = new AuditLog();
        Observer smsNotifier = new SMSNotifier("+40769395246");

        contBancar.adaugaObserver(clientFidel);
        contBancar.adaugaObserver(auditLog);
        contBancar.adaugaObserver(smsNotifier);

        contBancar.depunere(500);
        contBancar.retragere(300);
        contBancar.tranzactieInternationala(200, "Germania");

        System.out.println();
        contBancar.stergeObserver(smsNotifier);
        contBancar.retragere(2000);
    }
}
