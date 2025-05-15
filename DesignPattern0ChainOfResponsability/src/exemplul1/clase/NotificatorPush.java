package exemplul1.clase;

public class NotificatorPush extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.isAreAplicatie()){
            System.out.println("[PUSH]: " + client.getNumeClient() + " : " + mesaj);
        } else if(getUrmatorul() != null){
            getUrmatorul().notifica(client, mesaj);
        }
    }
}
