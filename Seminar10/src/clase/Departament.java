package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    private String nume;
    private List<IStructura> lista;

    public Departament(String nume) {
        this.nume = nume;
        lista = new ArrayList<>();
    }

    @Override
    public void descriereStructura() {
        System.out.println("Departamentul " + nume + " are urmatoarele subdepartamente: ");
        for(IStructura structura : lista){
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) {
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) {
        lista.remove(structura);
    }

    @Override
    public IStructura getNodCopil(int index) {
        return lista.get(index);
    }
}
