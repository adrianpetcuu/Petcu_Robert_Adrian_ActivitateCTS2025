package Registry;
import Clase.Masina;

import java.util.HashMap;
import java.util.Map;

public class MasinaRegistry {
    private Map<String, Masina> prototipuri = new HashMap<>();

    public void inregistreaza(String tip, Masina masina) {
        prototipuri.put(tip, masina);
    }

    public Masina cloneaza(String tip) {
        Masina prototip = prototipuri.get(tip);
        return prototip != null ? prototip.clone() : null;
    }
}

