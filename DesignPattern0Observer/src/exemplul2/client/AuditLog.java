package exemplul2.client;

public class AuditLog implements Observer{
    @Override
    public void notifica(String tipEveniment, String detalii) {
        System.out.println("[Audit] Log salvat: [" + tipEveniment + "] " + detalii);
    }
}
