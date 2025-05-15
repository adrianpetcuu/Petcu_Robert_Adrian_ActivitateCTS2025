package exemplul5.clase;

public class SuportNivel1 extends SuportHandler{
    @Override
    public void gestioneazaCerere(CerereSuport cerere) {
        if(cerere.getNivelDificultate() == 1){
            System.out.println("[Nivel 1] Raspuns pentru: " + cerere.getNumeClient() + ": Am gasit un raspuns in FAQ.");
        }
        else if(getUrmatorul() != null){
            getUrmatorul().gestioneazaCerere(cerere);
        }
    }
}
