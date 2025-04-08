package program;

import clase.PachetDigital;
import fabrici.*;

public class Main {
    public static void main(String[] args) {
        PachetDigitalFactory pdfFactory = new FactoryPachetPDF();
        PachetDigitalFactory audioFactory = new FactoryPachetAudio();
        PachetDigitalFactory comboFactory = new FactoryPachetCombinat();

        PachetDigital pachet1 = pdfFactory.crearePachet(TipPachetPDF.CARTE_SCURTA);
        pachet1.afisareDescriere();

        PachetDigital pachet2 = audioFactory.crearePachet(TipPachetAudio.AUDIO_EXTINS);
        pachet2.afisareDescriere();

        PachetDigital pachet3 = comboFactory.crearePachet(TipPachetCombinat.COMBO_BASIC);
        pachet3.afisareDescriere();
    }
}