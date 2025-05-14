package exemplul2.clase;

public abstract class ValidareFormular {
    protected String numeClient;

    public ValidareFormular(String numeClient){
        this.numeClient = numeClient;
    }

    public abstract void verificaDatePersonale();
    public abstract void verificaDocumente();
    public abstract void validareSpecifica();
    public abstract void confirmare();

    public final void validareFormular(){
        System.out.println("=== Incep validarea pentru " + numeClient + " ===");
        verificaDatePersonale();
        verificaDocumente();
        validareSpecifica();
        confirmare();
        System.out.println("=== Final validare ===");
    }

}
