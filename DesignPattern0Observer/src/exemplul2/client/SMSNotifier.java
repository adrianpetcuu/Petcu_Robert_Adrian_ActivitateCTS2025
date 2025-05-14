package exemplul2.client;

public class SMSNotifier implements Observer{
    private String numarTelefon;

    public SMSNotifier(String numarTelefon){
        this.numarTelefon = numarTelefon;
    }
    @Override
    public void notifica(String tipEveniment, String detalii) {
        System.out.println("[SMS catre " + numarTelefon + "] " + tipEveniment + ": " + detalii);
    }
}
