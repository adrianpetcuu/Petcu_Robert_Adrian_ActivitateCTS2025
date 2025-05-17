package model3_composite.model;

public interface Composite {
    void adaugaProdus(IProdus produs) throws Exception;
    void stergeProdus(IProdus produs) throws Exception;
    IProdus getNodCopil(int index) throws Exception;
}
