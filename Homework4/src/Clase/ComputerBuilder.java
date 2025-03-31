package Clase;

public class ComputerBuilder implements AbstractBuilder {
    private String procesor;
    private int ram;
    private int stocare;
    private boolean placaVideo;
    private boolean bluetooth;

    public ComputerBuilder() {
        // valori default
        this.procesor = "Intel i5";
        this.ram = 8;
        this.stocare = 256;
        this.placaVideo = false;
        this.bluetooth = false;
    }

    @Override
    public ComputerBuilder setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setStocare(int stocare) {
        this.stocare = stocare;
        return this;
    }

    @Override
    public ComputerBuilder setPlacaVideo(boolean placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    @Override
    public ComputerBuilder setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(procesor, ram, stocare, placaVideo, bluetooth);
    }
}
