package exemplul3.clase;

import java.util.List;

public class Compresor {
    private StrategieCompresie strategieCompresie;

    public Compresor(StrategieCompresie strategieCompresie){
        this.strategieCompresie = strategieCompresie;
    }

    public void setStrategieCompresie(StrategieCompresie strategieCompresie) {
        this.strategieCompresie = strategieCompresie;
    }

    public void arhiveaza(String numeArhiva, List<String> fisiere){
        strategieCompresie.comprima(numeArhiva, fisiere);
    }
}
