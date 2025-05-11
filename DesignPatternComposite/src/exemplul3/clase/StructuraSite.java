package exemplul3.clase;

public interface StructuraSite {
    void afiseaza(int indentare);
    void adaugaNod(StructuraSite structuraSite) throws Exception;
    void stergeNod(StructuraSite structuraSite) throws Exception;
    StructuraSite getNod(int index) throws Exception;
}
