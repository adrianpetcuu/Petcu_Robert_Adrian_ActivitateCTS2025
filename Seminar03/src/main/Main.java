package main;
import clase.AutoritatePescuitEager;
import clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.concediaza(2);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.setDenumire("ANpPA");
        autoritatePescuitEager.setWebsite("www.ANpPA.ro");
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutorizatie("Popescu Ion");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager altaAutoritateEager = AutoritatePescuitEager.getInstance();
        altaAutoritateEager.emiteAutorizatie("Popescu Mihai");
        System.out.println(altaAutoritateEager.toString());

        AutoritatePescuitLazy autoritatePescuitLazy = AutoritatePescuitLazy.getInstance("ANPA", "www.ANPA.ro", 10, 150);
        System.out.println(autoritatePescuitLazy.toString());
        AutoritatePescuitLazy altaAutoritateLazy = AutoritatePescuitLazy.getInstance("AdrianSem3", "AdrianSem3.ro", 20, 100);
        altaAutoritateLazy.angajeaza(2);
        System.out.println(autoritatePescuitLazy.toString());

    }
}