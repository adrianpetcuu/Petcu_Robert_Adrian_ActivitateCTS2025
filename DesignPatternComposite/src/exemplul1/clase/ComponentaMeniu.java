package exemplul1.clase;

public interface ComponentaMeniu {
    void afiseaza();
    void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception;
    void stergeNod(ComponentaMeniu componentaMeniu) throws Exception;
    ComponentaMeniu getNod(int index) throws Exception;
}
