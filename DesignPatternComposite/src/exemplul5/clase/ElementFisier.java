package exemplul5.clase;

public interface ElementFisier {
    void afiseaza(String indentare);
    void adaugaNod(ElementFisier elementFisier) throws Exception;
    void stergeNod(ElementFisier elementFisier) throws Exception;
    ElementFisier getNod(int index) throws Exception;
}
