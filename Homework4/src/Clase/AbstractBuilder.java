package Clase;

public interface AbstractBuilder {
    AbstractBuilder setProcesor(String procesor);
    AbstractBuilder setRam(int ram);
    AbstractBuilder setStocare(int stocare);
    AbstractBuilder setPlacaVideo(boolean placaVideo);
    AbstractBuilder setBluetooth(boolean bluetooth);
    Computer build();
}
