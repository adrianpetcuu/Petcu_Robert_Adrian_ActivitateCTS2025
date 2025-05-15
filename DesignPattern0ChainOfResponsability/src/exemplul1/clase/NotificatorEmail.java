package exemplul1.clase;

public class NotificatorEmail extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmailClient() != null){
            System.out.println("[Email] Trimis pentru: " + client.getNumeClient() + " : " + mesaj);
        } else if(getUrmatorul() != null){
            getUrmatorul().notifica(client, mesaj);
        }
    }
}
