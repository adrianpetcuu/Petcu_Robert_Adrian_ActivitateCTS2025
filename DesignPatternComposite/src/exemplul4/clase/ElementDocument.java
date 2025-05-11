package exemplul4.clase;

public interface ElementDocument {
    void afiseaza(int nivel);
    void adaugaNod(ElementDocument elementDocument) throws Exception;
    void stergeNod(ElementDocument elementDocument) throws Exception;
    ElementDocument getNod(int index) throws Exception;
}
