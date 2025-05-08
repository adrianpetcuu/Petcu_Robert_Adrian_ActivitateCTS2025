package clase;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectia: " + nume);
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        throw new Exception();
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception();
    }

    @Override
    public IStructura getNodCopil(int index) throws Exception {
        return null;
    }
}
