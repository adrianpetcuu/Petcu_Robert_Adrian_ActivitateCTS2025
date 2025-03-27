package Fabrici;

import Clase.Angajat;
import Clase.Portar;
import Clase.Secretar;

import static Fabrici.TipPersonalNonMedical.PORTAR;
import static Fabrici.TipPersonalNonMedical.SECRETAR;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public void setVechime(int vechime){
        this.vechime = vechime;
    }

    public FactoryPersonalNonMedical(int vechime){
        this.vechime = vechime;
    }
    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch(tipPersonal){
            case SECRETAR -> new Secretar(nume, salariu, vechime);
            case PORTAR -> new Portar(nume, salariu, vechime);
            default -> null;
        };
    }
}
