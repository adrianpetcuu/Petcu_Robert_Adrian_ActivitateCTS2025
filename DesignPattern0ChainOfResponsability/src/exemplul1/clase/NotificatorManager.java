package exemplul1.clase;

public class NotificatorManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("[Manager] Nu putem contacta clientul: " + client.getNumeClient());
    }
}
