package exemplul5.clase;

public class SuportNivel2 extends SuportHandler{
    @Override
    public void gestioneazaCerere(CerereSuport cerere) {
        if(cerere.getNivelDificultate() == 2){
            System.out.println("[Nivel 2] Raspuns pentru: " + cerere.getNumeClient() + ": Am analizat logurile si am gasit problema.");
        }
        else if(getUrmatorul() != null){
            getUrmatorul().gestioneazaCerere(cerere);
        }
    }
}
