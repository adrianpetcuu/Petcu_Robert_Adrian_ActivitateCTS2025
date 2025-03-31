package Clase;

public class Computer {
    private String procesor;
    private int ram;
    private int stocare;
    private boolean placaVideo;
    private boolean bluetooth;

    public Computer(String procesor, int ram, int stocare, boolean placaVideo, boolean bluetooth) {
        this.procesor = procesor;
        this.ram = ram;
        this.stocare = stocare;
        this.placaVideo = placaVideo;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", ram=" + ram + "GB" +
                ", stocare=" + stocare + "GB" +
                ", placaVideo=" + placaVideo +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
