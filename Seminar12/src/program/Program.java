package program;

import clase.*;

public class Program {
    public static void main(String[] args) {
        ARecomandaTransport recomandaTroleibuz = new RecomandaTroleibuz();
        ARecomandaTransport recomandaAutobuz = new RecomandaAutobuz();
        ARecomandaTransport recomandaTramvai = new RecomandaTramvai();
        ARecomandaTransport recomandaMetrou = new RecomandaMetrou();

        recomandaTroleibuz.setUrmator(recomandaAutobuz);
        recomandaAutobuz.setUrmator(recomandaTramvai);
        recomandaTramvai.setUrmator(recomandaMetrou);

        recomandaTroleibuz.recomandaTransport(2);
        recomandaTroleibuz.recomandaTransport(4);
        recomandaTroleibuz.recomandaTransport(8);
        recomandaTroleibuz.recomandaTransport(15);
    }
}