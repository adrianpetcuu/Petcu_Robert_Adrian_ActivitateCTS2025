package exemplul4.proxy;

import exemplul4.clase.IServer;
import exemplul4.clase.Server;

import java.util.Arrays;

public class ProxyRol implements IServer {
    private Server server;

    public ProxyRol(Server server) {
        this.server = server;
    }

    @Override
    public void conecteaza(String utilizator, String rol, int oraAcces) {
        if(Arrays.asList(server.getRoluriPermise()).contains(rol.toLowerCase())){
            server.conecteaza(utilizator, rol, oraAcces);
        }
        else{
            System.out.println("Acces refuzat! Rolul " + rol + " nu are permisiuni pe acest server.");
        }
    }
}
