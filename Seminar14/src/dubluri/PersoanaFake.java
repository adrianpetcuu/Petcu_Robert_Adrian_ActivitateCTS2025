package dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {

    private int varsta;

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String getSex() {
        return "";
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
