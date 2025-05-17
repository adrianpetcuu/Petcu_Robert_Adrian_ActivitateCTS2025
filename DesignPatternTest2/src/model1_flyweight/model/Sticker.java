package model1_flyweight.model;

public class Sticker implements StickerFlyweight{
    private String dimensiuni;

    public Sticker(Masina masina) {
        this.dimensiuni = creeazaSticker(masina);
        System.out.println("✔️ Se construiește un nou sticker pentru: " + masina.getModel() + ", " + masina.getAnFabricatie() + dimensiuni);
    }

    @Override
    public String creeazaSticker(Masina masina) {
        return ", Dimensiuni : S-a creat Stickerul => Model: " + masina.getModel() + ", An Fabricatie: " + masina.getAnFabricatie();
    }
}
