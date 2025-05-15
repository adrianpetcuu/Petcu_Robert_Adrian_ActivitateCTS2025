package exemplul2.clase;

public class RefuzAutomat extends ProcesatorCerere{
    @Override
    public void proceseazaCerere(CerereConcediu cerereConcediu) {
        System.out.println("Refuz automat: Cererea de concediu pentru " + cerereConcediu.getAngajat() + " a fost respinsă. " +
                "(" + cerereConcediu.getNrZile() + " zile nu pot fi aprobate)");
    }
}
