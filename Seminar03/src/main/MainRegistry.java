package main;

import SingletonRegistry.AutoritatePescuit;
import SingletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args){
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance();
        Autorizatie autorizatie = autoritatePescuit.emiteAutorizatie("pescar");
        System.out.println(autorizatie.toString());
    }
}
