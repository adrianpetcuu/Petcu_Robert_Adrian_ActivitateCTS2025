package model5_strategy.main;

import model5_strategy.model.*;

public class Program {
    public static void main(String[] args) {
        IClient client = new Client("Adrian Petcu");

        ModPlata cardBancar = new CardBancar();
        ModPlata virament = new Virament();

        client.efectueazaPlata(10000);

        client.setModPlata(cardBancar);
        client.efectueazaPlata(1000);

        client.setModPlata(virament);
        client.efectueazaPlata(5000);
    }
}
