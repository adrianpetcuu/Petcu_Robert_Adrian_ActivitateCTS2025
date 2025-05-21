package model8_composite.model;

public interface CodeComposite {
    void parcurge() throws Exception;
    void adaugaNod(Code nod) throws Exception;
    void stergeNod(Code nod) throws Exception;
    Code getNodCopil(int index) throws Exception;
}
