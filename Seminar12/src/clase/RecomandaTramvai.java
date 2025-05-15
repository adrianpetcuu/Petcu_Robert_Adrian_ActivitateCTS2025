package clase;

public class RecomandaTramvai extends ARecomandaTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta <= 10){
            System.out.println("Se recomanda sa iei Tramvaiul.");
        } else if(urmator != null){
            urmator.recomandaTransport(distanta);
        }
    }
}
