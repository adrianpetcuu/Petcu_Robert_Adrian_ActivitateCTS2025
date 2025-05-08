package clase;

public interface IStructura {
    //trebuie implementat si in nodul frunza si arunca exceptii
    void descriereStructura();
    void adaugaNod(IStructura structura) throws Exception;
    void stergeNod(IStructura structura) throws Exception;
    IStructura getNodCopil(int index) throws Exception;
}
