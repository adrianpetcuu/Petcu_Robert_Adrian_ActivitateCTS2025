package exemplul2.clase;

public class FormularClientInternational extends ValidareFormular{

    public FormularClientInternational(String numeClient) {
        super(numeClient);
    }

    @Override
    public void verificaDatePersonale() {
        System.out.println("Verific nume si pasaport pentru client strain: " + numeClient);
    }

    @Override
    public void verificaDocumente() {
        System.out.println("Verific documente traduse si legalizate pentru: " + numeClient);
    }

    @Override
    public void validareSpecifica() {
        System.out.println("Verific viza/residenta si dovada adresei pentru: " + numeClient);
    }

    @Override
    public void confirmare() {
        System.out.println("Formular validat pentru client international: " + numeClient);
    }
}
