package program;


import clase.Facade;
import clase.Masa;

public class Program {
    public static void main(String[] args) {
        Masa masa = new Masa(4 , true);
        Facade facade = new Facade();
        System.out.println(facade.verificaAsezareMasa(masa));

        Masa masa1 = new Masa(7, true);
        System.out.println(facade.verificaAsezareMasa(masa1));

        Masa masa2 = new Masa(8, false);
        System.out.println(facade.verificaAsezareMasa(masa2));
    }
}