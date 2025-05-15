package clase;

public class RecomandaTroleibuz extends ARecomandaTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta < 0){
            System.out.println("Parametrul este incorect.");
        }
        if(distanta <= 3){
            System.out.println("Se recomanda sa iei Troleibuzul.");
        } else if(urmator != null){
            urmator.recomandaTransport(distanta);
        }
    }
}
