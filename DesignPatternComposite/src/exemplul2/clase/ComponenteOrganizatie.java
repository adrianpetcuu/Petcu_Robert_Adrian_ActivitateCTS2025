package exemplul2.clase;

public interface ComponenteOrganizatie {
    void afiseazaDetalii();
    void adaugaNod(ComponenteOrganizatie componenteOrganizatie) throws Exception;
    void stergeNod(ComponenteOrganizatie componenteOrganizatie) throws Exception;
    ComponenteOrganizatie getNod(int index) throws Exception;
}
