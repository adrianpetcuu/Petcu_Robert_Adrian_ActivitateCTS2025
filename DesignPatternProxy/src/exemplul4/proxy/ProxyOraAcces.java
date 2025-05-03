package exemplul4.proxy;

import exemplul4.clase.IServer;

public class ProxyOraAcces implements IServer {
    private IServer server;

    public ProxyOraAcces(IServer server){
        this.server = server;
    }

    @Override
    public void conecteaza(String utilizator, String rol, int oraAcces) {
        if(oraAcces >= 8 && oraAcces <= 18) {
            server.conecteaza(utilizator, rol, oraAcces);
        } else {
            System.out.println("Acces refuzat! Conectarile sunt permise doar intre orele 8:00 si 18:00.");
        }
    }
}
