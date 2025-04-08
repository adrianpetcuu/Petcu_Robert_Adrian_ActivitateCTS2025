package fabrici;

import clase.CarteAudio;
import clase.PachetDigital;

public class FactoryPachetAudio implements PachetDigitalFactory{
    @Override
    public PachetDigital crearePachet(TipPachetDigital tip) {
        return switch((TipPachetAudio) tip){
            case AUDIO_SCURT -> new CarteAudio("Poveste audio", 15);
            case AUDIO_EXTINS -> new CarteAudio("Roman audio", 120);
        };
    }
}
