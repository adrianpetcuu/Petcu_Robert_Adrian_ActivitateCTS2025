package Composite.model;

public interface ComponentaFisiere {
    void afiseaza(String indentare);
    int getDimensiune();
    void adaugaNod(ComponentaFisiere componentaFisiere);
    void stergeNod(ComponentaFisiere componentaFisiere);
    ComponentaFisiere getNod(int index);
}
