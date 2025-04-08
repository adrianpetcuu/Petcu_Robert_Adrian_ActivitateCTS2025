package fabrici;

import clase.PachetDigital;

public interface PachetDigitalFactory {
    PachetDigital crearePachet(TipPachetDigital tip);
}
