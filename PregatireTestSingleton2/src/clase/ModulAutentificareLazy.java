package clase;

public class ModulAutentificareLazy {
    private String user;
    private String token;
    private boolean esteAutentificat;

    //instanta statica
    private static ModulAutentificareLazy instanta;

    //constructor privat
    private ModulAutentificareLazy(){
        esteAutentificat = false;
    }

    //functie statica care returneaza instanta
    public static ModulAutentificareLazy getInstance(){
        if(instanta == null){
            instanta = new ModulAutentificareLazy();
        }
        return instanta;
    }

    public void autentifica(String user){
        this.user = user;
        this.token = "token_" + user;
        this.esteAutentificat = true;
    }

    public void delogare(){
        user = null;
        token = null;
        esteAutentificat = false;
    }

    public boolean esteAutentificat(){
        return esteAutentificat;
    }

    public String getToken(){
        return esteAutentificat ? token : "Neautentificat";
    }

    public String getUtilizator(){
        return esteAutentificat ? user : "Anonim";
    }
}
