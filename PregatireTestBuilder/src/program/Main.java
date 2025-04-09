package program;

import clase.ContBancar;
import clase.ContBancarBuilderV1;
import clase.ContBancarBuilderV2;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar();
        contBancar.setDetinator("Adrian Petcu");
        contBancar.setSuma(10000);
        contBancar.setMoneda("Ron");
        contBancar.setContSalariu(true);
        contBancar.setInternetBanking(true);
        contBancar.setCardAtasat(true);

        //System.out.println(contBancar.toString());
        //ContBancar contBancar2 = new ContBancarBuilderV1().setDetinator("Ion Vasile").setSuma(2000).setCardAtasat(true).setContSalariu(true).build();
        //System.out.println();
        //System.out.println(contBancar2.toString());
        //ContBancar contBancar3 = new ContBancarBuilderV1().setDetinator("Mihai Andrei").setCardAtasat(false).setMoneda("LEI").build();
        //System.out.println();
        //System.out.println(contBancar2.toString());
        //System.out.println(contBancar3.toString());

        System.out.println(contBancar.toString());
        ContBancar contBancar2 = new ContBancarBuilderV2().setDetinator("Ion Vasile").setSuma(2000).setCardAtasat(true).setContSalariu(true).build();
        System.out.println();
        System.out.println(contBancar2.toString());
        ContBancar contBancar3 = new ContBancarBuilderV2().setDetinator("Mihai Andrei").setCardAtasat(false).setMoneda("LEI").build();
        System.out.println();
        System.out.println(contBancar2.toString());
        System.out.println(contBancar3.toString());

    }
}