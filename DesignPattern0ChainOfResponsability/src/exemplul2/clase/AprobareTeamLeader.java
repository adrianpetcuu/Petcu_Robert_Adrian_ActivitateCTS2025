package exemplul2.clase;

public class AprobareTeamLeader extends ProcesatorCerere{
    @Override
    public void proceseazaCerere(CerereConcediu cerereConcediu) {
        if(cerereConcediu.getNrZile() <= 3){
            System.out.println("Team Leader: Aprob concediul pentru: " + cerereConcediu.getAngajat() + " : " + cerereConcediu.getNrZile() + " zile.");
        } else if(getUrmatorul() != null){
            getUrmatorul().proceseazaCerere(cerereConcediu);
        }
    }
}
