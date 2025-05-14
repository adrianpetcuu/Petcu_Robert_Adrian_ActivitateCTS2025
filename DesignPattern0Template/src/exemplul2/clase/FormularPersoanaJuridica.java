package exemplul2.clase;

public class FormularPersoanaJuridica extends ValidareFormular{

    public FormularPersoanaJuridica(String numeClient) {
        super(numeClient);
    }

    @Override
    public void verificaDatePersonale() {
        System.out.println("Verific nume firma si CUI pentru: " + numeClient);
    }

    @Override
    public void verificaDocumente() {
        System.out.println("Verific certificat inregistrare + buletin administrator pentru: " + numeClient);
    }

    @Override
    public void validareSpecifica() {
        System.out.println("Verific existenta in registrul comertului pentru: " + numeClient);
    }

    @Override
    public void confirmare() {
        System.out.println("Formular validat cu succes pentru persoana juridica: " + numeClient);
    }
}
