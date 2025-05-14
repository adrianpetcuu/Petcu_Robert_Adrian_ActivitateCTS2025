package exemplul3.program;

import exemplul3.clase.CreditAuto;
import exemplul3.clase.CreditIpotecar;
import exemplul3.clase.ProcesatorDosar;
import exemplul3.clase.Refinantare;

public class Program {
    public static void main(String[] args) {
        ProcesatorDosar creditIpotecar = new CreditIpotecar("Vasile Ionel");
        creditIpotecar.proceseazaDosar();

        ProcesatorDosar creditAuto = new CreditAuto("Mihai Gheorghe");
        creditAuto.proceseazaDosar();

        ProcesatorDosar refinantare = new Refinantare("Adrian Popescu");
        refinantare.proceseazaDosar();
    }
}
