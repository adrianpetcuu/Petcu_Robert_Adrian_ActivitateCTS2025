package exemplul2.clase;

public class AprobareManager extends ProcesatorCerere{
    @Override
    public void proceseazaCerere(CerereConcediu cerereConcediu) {
        if(cerereConcediu.getNrZile() <= 10){
            System.out.println("Manager: Aprob concediul pentru: " + cerereConcediu.getAngajat() + " : " + cerereConcediu.getNrZile() + " zile.");
        } else if(getUrmatorul() != null){
            getUrmatorul().proceseazaCerere(cerereConcediu);
        }
    }
}
