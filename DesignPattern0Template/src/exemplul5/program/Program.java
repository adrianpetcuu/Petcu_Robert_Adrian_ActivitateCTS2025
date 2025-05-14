package exemplul5.program;

import exemplul5.clase.EvaluareCandidat;
import exemplul5.clase.EvaluareManager;
import exemplul5.clase.EvaluareProgramator;
import exemplul5.clase.EvaluareTester;

public class Program {
    public static void main(String[] args) {
        EvaluareCandidat evaluareProgramator = new EvaluareProgramator("Ana Ionescu");
        EvaluareCandidat evaluareTester = new EvaluareTester("Mihai Dan");
        EvaluareCandidat evaluareManager = new EvaluareManager("Adrian Petcu");

        evaluareProgramator.evalueaza();
        evaluareTester.evalueaza();
        evaluareManager.evalueaza();
    }
}
