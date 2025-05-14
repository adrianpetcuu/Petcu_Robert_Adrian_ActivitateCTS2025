package exemplul2.clase;

public class FormularPersoanaFizica extends ValidareFormular{

    public FormularPersoanaFizica(String numeClient) {
        super(numeClient);
    }

    @Override
    public void verificaDatePersonale() {
        System.out.println("Verific nume si CNP pentru: " + numeClient);
    }

    @Override
    public void verificaDocumente() {
        System.out.println("Verific copie buletin pentru: " + numeClient);
    }

    @Override
    public void validareSpecifica() {
        System.out.println("Verific varsta minima (>= 18 ani) pentru: " + numeClient);
    }

    @Override
    public void confirmare() {
        System.out.println("Formular validat cu succes pentru persoana fizica: " + numeClient);
    }
}
