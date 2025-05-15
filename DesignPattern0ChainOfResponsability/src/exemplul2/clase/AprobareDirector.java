package exemplul2.clase;

public class AprobareDirector extends ProcesatorCerere{
    @Override
    public void proceseazaCerere(CerereConcediu cerereConcediu) {
        if(cerereConcediu.getNrZile() <= 30){
            System.out.println("[Director] Aprob concediul pentru: " + cerereConcediu.getAngajat() + " : " + cerereConcediu.getNrZile() + " zile.");
        } else if(getUrmatorul() != null){
            getUrmatorul().proceseazaCerere(cerereConcediu);
        }
    }
}
