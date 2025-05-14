package exemplul3.client;

public class ServiciuFacturare implements Observer{
    @Override
    public void notifica(String codComanda, String status) {
        if(status.equals("livrata")){
            System.out.println("[Facturare] Generare factura pentru comanda: " + codComanda);
        }
    }
}
