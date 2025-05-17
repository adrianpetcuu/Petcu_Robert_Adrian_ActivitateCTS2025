package model1_flyweight.main;

import model1_flyweight.model.FabricaDeStickere;
import model1_flyweight.model.Masina;
import model1_flyweight.model.Sticker;

public class Program {
    public static void main(String[] args) {
        FabricaDeStickere fabricaDeStickere = new FabricaDeStickere();

        Masina masina1 = new Masina("Audi A4", 2020);
        Masina masina2 = new Masina("Mercedes CLA", 2019);
        Masina masina3 = new Masina("Audi A4", 2020);
        Masina masina4 = new Masina("Mercedes CLA", 2019);
        Masina masina5 = new Masina("BMW M5", 2021);

        Sticker sticker1 = fabricaDeStickere.getSticker(masina1);
        Sticker sticker2 = fabricaDeStickere.getSticker(masina2);
        Sticker sticker3 = fabricaDeStickere.getSticker(masina3);
        Sticker sticker4 = fabricaDeStickere.getSticker(masina4);
        Sticker sticker5 = fabricaDeStickere.getSticker(masina5);

        System.out.println(fabricaDeStickere.getDimensiune());


    }
}
