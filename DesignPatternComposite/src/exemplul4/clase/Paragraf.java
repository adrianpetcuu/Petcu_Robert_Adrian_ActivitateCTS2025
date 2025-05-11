package exemplul4.clase;

public class Paragraf implements ElementDocument{
    private String text;

    public Paragraf(String text){
        this.text = text;
    }

    @Override
    public void afiseaza(int nivel) {
        String indent = " ".repeat(nivel * 2);
        System.out.println(indent + "- " + text);
    }

    @Override
    public void adaugaNod(ElementDocument elementDocument) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public void stergeNod(ElementDocument elementDocument) throws Exception {
        throw new Exception("Nu este implementata.");
    }

    @Override
    public ElementDocument getNod(int index) throws Exception {
        throw new Exception("Nu este implementata.");
    }
}
