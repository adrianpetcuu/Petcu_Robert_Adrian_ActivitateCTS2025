package Fabrici;

import Clase.Angajat;

public interface FactoryPersonal{
    Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
