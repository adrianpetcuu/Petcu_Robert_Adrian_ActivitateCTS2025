package exemplul5.clase;

public class API implements IAPI{

    @Override
    public void executaTranzactie(String client, String rol, boolean activ, int ora, double suma) {
        System.out.println("Tranzactie reusita pentru clientul: " + client + " ,rol: " + rol + " ,stare cont: " + activ + " ,la ora: " + ora + ":00 ,suma: " + suma + " lei.");
    }
}
