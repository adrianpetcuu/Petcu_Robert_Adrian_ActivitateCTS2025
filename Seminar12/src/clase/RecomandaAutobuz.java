package clase;

import java.sql.SQLOutput;

public class RecomandaAutobuz extends ARecomandaTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta <= 5){
            System.out.println("Se recomanda sa iei Autobuzul.");
        } else if(urmator != null){
            urmator.recomandaTransport(distanta);
        }
    }
}
