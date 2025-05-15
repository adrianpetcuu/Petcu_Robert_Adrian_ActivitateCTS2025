package exemplul5.clase;

public class RaspunsAutomat extends SuportHandler{
    @Override
    public void gestioneazaCerere(CerereSuport cerere) {
        System.out.println("[AUTOMAT] Nu putem procesa solicitarea pentru: " + cerere.getNumeClient() + ". Contactati manual un operator.");
    }
}
