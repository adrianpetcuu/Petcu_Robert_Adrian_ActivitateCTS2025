package exemplul1.clase;

public abstract class Notificator {
    private Notificator urmatorul;

    public Notificator getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(Notificator urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void notifica(Client client, String mesaj);
}
