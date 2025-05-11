package exemplul2.program;

import exemplul2.clase.Angajat;
import exemplul2.clase.ComponenteOrganizatie;
import exemplul2.clase.Manager;

public class Program {
    public static void main(String[] args) {
        ComponenteOrganizatie dev1 = new Angajat("Ion Popescu", "Developer");
        ComponenteOrganizatie dev2 = new Angajat("Andrei Ionescu", "Developer");
        ComponenteOrganizatie tester1 = new Angajat("Elena Georgescu", "Tester");
        ComponenteOrganizatie hr1 = new Angajat("Maria Radu", "HR Specialist");

        ComponenteOrganizatie teamLeadDev = new Manager("Raluca Dobre", "Team Lead Dev");
        try {
            teamLeadDev.adaugaNod(dev1);
            teamLeadDev.adaugaNod(dev2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ComponenteOrganizatie teamLeadQA = new Manager("Alex Marinescu", "Team Lead QA");
        try {
            teamLeadQA.adaugaNod(tester1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ComponenteOrganizatie managerHR = new Manager("Simona Cristea", "Manager HR");
        try {
            managerHR.adaugaNod(hr1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ComponenteOrganizatie director = new Manager("George Vlasi", "Director General");
        try {
            director.adaugaNod(teamLeadDev);
            director.adaugaNod(teamLeadQA);
            director.adaugaNod(managerHR);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        director.afiseazaDetalii();

    }
}
