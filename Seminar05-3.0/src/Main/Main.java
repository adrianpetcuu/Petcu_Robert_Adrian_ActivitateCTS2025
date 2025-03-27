package Main;


import Clase.Angajat;
import Fabrici.FactoryPersonalMedical;
import Fabrici.FactoryPersonalNonMedical;
import Fabrici.TipPersonalMedical;
import Fabrici.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        //factory method se aplica
        FactoryPersonalMedical fabricaPersonalMedical = new FactoryPersonalMedical(10.5);
        FactoryPersonalNonMedical fabricaPersonalNonMedical = new FactoryPersonalNonMedical(10);
        Angajat medic = fabricaPersonalMedical.creareAngajat(TipPersonalMedical.MEDIC, "medic", 5000);
        fabricaPersonalMedical.setSpor(15);
        Angajat asistent = fabricaPersonalMedical.creareAngajat(TipPersonalMedical.ASISTENT, "asistent", 4000);
        Angajat secretar = fabricaPersonalNonMedical.creareAngajat(TipPersonalNonMedical.SECRETAR, "secretar", 3500);
        fabricaPersonalNonMedical.setVechime(10);
        Angajat portar = fabricaPersonalNonMedical.creareAngajat(TipPersonalNonMedical.PORTAR, "portar", 3000);
        System.out.println(medic.toString());
        System.out.println(asistent.toString());
        System.out.println(secretar.toString());
        System.out.println(portar.toString());
    }
}