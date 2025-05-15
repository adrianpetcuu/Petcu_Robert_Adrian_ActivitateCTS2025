package exemplul1.clase;

public class NotificatorTelefon extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNumarTelefon() != null){
            System.out.println("[Telefon] Suna pe: " + client.getNumarTelefon() + ", client: " + client.getNumeClient() + " : " + mesaj);
        } else if(getUrmatorul() != null){
            getUrmatorul().notifica(client, mesaj);
        }
    }
}
