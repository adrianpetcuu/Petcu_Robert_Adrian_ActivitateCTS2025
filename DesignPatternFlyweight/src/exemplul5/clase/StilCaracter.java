package exemplul5.clase;

public class StilCaracter implements ICaracter{
    //rand si coloana sunt date unice
    //litera, font, marime, bold - date comune se partajeaza
    private char litera;
    private String font;
    private int marime;
    private boolean bold;

    public StilCaracter(char litera, String font, int marime, boolean bold) {
        this.litera = litera;
        this.font = font;
        this.marime = marime;
        this.bold = bold;
    }

    @Override
    public void afiseaza(int rand, int coloana) {
        System.out.println("Caracter '" + litera + "' stilizat cu font " + font + ", marime " + marime +
                (bold ? ", bold" : "") + " la pozitia [" + rand + ", " + coloana + "].");
    }
}
