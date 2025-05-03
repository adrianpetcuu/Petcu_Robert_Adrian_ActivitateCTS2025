package exemplul3.clase;

public class Document implements IDocument{
    private String titlu;
    private String nivelConfidentialitate;

    public Document(String titlu, String nivelConfidentialitate) {
        this.titlu = titlu;
        this.nivelConfidentialitate = nivelConfidentialitate;
    }

    public String getNivelConfidentialitate(){
        return nivelConfidentialitate;
    }

    @Override
    public void citeste(String numeAngajat, String grad) {
        System.out.println("Angajatul: " + numeAngajat + " citeste documentul: " + titlu + " (" + nivelConfidentialitate + ").");
    }
}
