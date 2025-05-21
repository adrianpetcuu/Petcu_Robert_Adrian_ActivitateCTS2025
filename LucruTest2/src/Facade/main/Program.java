package Facade.main;

import Facade.model.FacadeAngajare;
import Facade.model.ProcesAngajare;

public class Program {
    public static void main(String[] args) {
        ProcesAngajare angajator = new FacadeAngajare();
        angajator.angajeazaCandidat("Ioana Popescu");
        angajator.angajeazaCandidat("Andrei Ionescu");
    }
}
