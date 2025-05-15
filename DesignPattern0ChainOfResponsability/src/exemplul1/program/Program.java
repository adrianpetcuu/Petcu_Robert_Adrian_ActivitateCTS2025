package exemplul1.program;

import exemplul1.clase.*;

public class Program {
    public static void main(String[] args) {
        Notificator push = new NotificatorPush();
        Notificator email = new NotificatorEmail();
        Notificator telefon = new NotificatorTelefon();
        Notificator manager = new NotificatorManager();

        push.setUrmatorul(email);
        email.setUrmatorul(telefon);
        telefon.setUrmatorul(manager);

        Client client1 = new Client("Andrei", "andrei@gmail.com", null, false);
        Client client2 = new Client("Maria", null, null, true);
        Client client3 = new Client("Ionel", null, null, false);

        push.notifica(client1, "Ai o reducere activa!");
        push.notifica(client2, "Rezervarea ta este confirmata!");
        push.notifica(client3, "Te rugam sa ne contactezi urgent!");
    }
}