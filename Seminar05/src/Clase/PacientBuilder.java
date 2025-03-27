package Clase;

public class PacientBuilder implements AbstractBuilder{
    private Pacient pacient;

    public PacientBuilder(String nume){
        this.pacient = new Pacient(nume, false, false, false, false, "Alt pacient");
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun){
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean arePapuciDeCamera){
        this.pacient.setArePapuciDeCameara(arePapuciDeCamera);
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat){
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor){
        this.pacient.setNumeInsotitor(numeInsotitor);
        return this;
    }


    @Override
    public Pacient getPacient() {
        return this.pacient;
    }


}
