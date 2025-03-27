package Fabrici;

import Clase.Angajat;
import Clase.Asistent;
import Clase.Medic;

import static Fabrici.TipPersonalMedical.ASISTENT;
import static Fabrici.TipPersonalMedical.MEDIC;

public class FactoryPersonalMedical implements FactoryPersonal{

    private double spor;

    public FactoryPersonalMedical(double spor){
        this.spor = spor;
    }

    public void setSpor(double spor){
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch(tipPersonal) {
            case ASISTENT -> new Asistent(nume, salariu, spor);
            case MEDIC -> new Medic(nume, salariu, spor);
            default -> null;
        };
    }
}
