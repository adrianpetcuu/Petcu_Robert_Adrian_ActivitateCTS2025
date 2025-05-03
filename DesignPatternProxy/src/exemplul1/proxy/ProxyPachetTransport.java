package exemplul1.proxy;

import exemplul1.clase.PachetTransport;
import exemplul1.clase.PachetTuristic;
import exemplul1.clase.Persoana;

public class ProxyPachetTransport implements PachetTuristic {
    private PachetTransport pachetTransport;

    public ProxyPachetTransport(PachetTransport pachetTransport){
        this.pachetTransport = pachetTransport;
    }

    public ProxyPachetTransport(Persoana persoana){
        this.pachetTransport = new PachetTransport(persoana);
    }


    @Override
    public void descriere() {
        pachetTransport.descriere();
    }

    @Override
    public void rezervaPachet() {
        if(pachetTransport.getPersoana().getVarsta() >= 65){
            pachetTransport.rezervaPachet();
        }
        else{
            System.out.println("Rezervarea nu este permisa, deoarece " + pachetTransport.getPersoana().getNume() +
                    " are doar " + pachetTransport.getPersoana().getVarsta() + " ani.");
        }
    }
}
