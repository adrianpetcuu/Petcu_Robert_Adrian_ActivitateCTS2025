package exemplul5.clase;

public class AdministratorSistem extends SuportHandler{
    @Override
    public void gestioneazaCerere(CerereSuport cerere) {
        if(cerere.getNivelDificultate() == 3){
            System.out.println("[ADMIN] Interventie critica pentru " + cerere.getNumeClient() + ": repornire server, configurare sistem.");
        }
        else if(getUrmatorul() != null){
            getUrmatorul().gestioneazaCerere(cerere);
        }
    }
}
