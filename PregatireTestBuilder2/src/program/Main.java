package program;

import clase.ContBancar;
import clase.ContBancarBuilder;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar1 = new ContBancarBuilder("Adrian Petcu", "RO49AAAA1B31007593840000").setTipCont("Economii").setDobanda(2.5).build();
        ContBancar contBancar2 = new ContBancarBuilder("Ioana Vasile", "RO59BBBB1B31007593840001").setAreCard(true).build();
        ContBancar contBancar3 = new ContBancarBuilder("Mihai Soare", "RO69CCCC1B31007593840002").build();
        System.out.println(contBancar1);
        System.out.println(contBancar2);
        System.out.println(contBancar3);
    }
}