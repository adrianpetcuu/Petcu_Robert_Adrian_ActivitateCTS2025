package program;

import clase.Nota;
import clase.NotaPlata;
import decorator.NotaAnNou;
import decorator.NotaCraciun;
import decorator.NotaPaste;

public class Program {
    public static void main(String[] args) {
        Nota nota = new NotaPlata(150);
        nota.printare();
        System.out.println();
        Nota notaDecorata = new NotaAnNou(nota);
        notaDecorata.printare();
        System.out.println();
        Nota notaCraciun = new NotaCraciun(notaDecorata);
        notaCraciun.printare();
        System.out.println();
        Nota notaPaste = new NotaPaste(notaDecorata);
        notaPaste.printare();
    }
}