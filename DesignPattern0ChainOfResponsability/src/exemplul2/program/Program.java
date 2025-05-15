package exemplul2.program;

import exemplul2.clase.*;

public class Program {
    public static void main(String[] args) {
        ProcesatorCerere aprobareTeamLeader = new AprobareTeamLeader();
        ProcesatorCerere aprobareManager = new AprobareManager();
        ProcesatorCerere aprobareDirector = new AprobareDirector();
        ProcesatorCerere refuzAutomat = new RefuzAutomat();

        aprobareTeamLeader.setUrmatorul(aprobareManager);
        aprobareManager.setUrmatorul(aprobareDirector);
        aprobareDirector.setUrmatorul(refuzAutomat);

        CerereConcediu c1 = new CerereConcediu("Andrei", 2, "concediu medical");
        CerereConcediu c2 = new CerereConcediu("Maria", 7, "vacanță");
        CerereConcediu c3 = new CerereConcediu("George", 15, "călătorie");
        CerereConcediu c4 = new CerereConcediu("Elena", 40, "neprevăzut");

        aprobareTeamLeader.proceseazaCerere(c1);
        aprobareTeamLeader.proceseazaCerere(c2);
        aprobareTeamLeader.proceseazaCerere(c3);
        aprobareTeamLeader.proceseazaCerere(c4);
    }

}
