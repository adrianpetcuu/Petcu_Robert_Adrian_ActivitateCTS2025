package exemplul2.decorator;

import exemplul2.clase.IAbonament;

public class DispozitiveExtraDecorator extends DecoratorAbonament{
    public DispozitiveExtraDecorator(IAbonament abonament) {
        super(abonament);
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println(" + Include acces pe 4 dispozitive simultan.");
    }

    @Override
    public double getPret() {
        return super.getPret() + 10;
    }

    @Override
    public void anuntaOptiunea() {
        System.out.println("Ati adaugat optiunea: Dispozitive multiple.");
    }
}
