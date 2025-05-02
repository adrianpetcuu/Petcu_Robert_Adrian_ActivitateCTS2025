package exemplul2.decorator;

import exemplul2.clase.IAbonament;

public abstract class DecoratorAbonament implements IAbonament {
    protected IAbonament abonament;

    public DecoratorAbonament(IAbonament abonament) {
        this.abonament = abonament;
    }

    @Override
    public void descriere() {
        abonament.descriere();
    }

    @Override
    public double getPret() {
        return abonament.getPret();
    }

    //metoda abstracta
    public abstract void anuntaOptiunea();
}
