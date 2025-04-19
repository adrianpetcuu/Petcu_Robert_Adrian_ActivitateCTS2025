package exemplul1.clase;

public class PlataCard implements Plata {

    private String numarCard;

    public PlataCard(String numarCard) {
        this.numarCard = numarCard;
    }

    @Override
    public void plateste(float suma) {
        System.out.println("Plata cu cardul " + numarCard + " in valoare de " + suma + " lei.");
    }
}
