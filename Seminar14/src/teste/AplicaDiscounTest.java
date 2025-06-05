package teste;

import categorii.CategorieCorrect;
import categorii.CategorieRightBicep;
import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import dubluri.PersoanaFake;
import dubluri.PersoanaStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class AplicaDiscounTest {


    @Test
    @Category({CategorieCorrect.class, CategorieRightBicep.class})
    public void aplicaDiscountVarstniciBoundaryStub() {
        IPersoana persoana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Maldive", 1000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900.00, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CategorieRightBicep.class)
    public void aplicaDiscountVarstniciFakeRight(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(70);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Roma", 1000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900.00, pachetTuristic.getPret(), 0.0001);
    }

    @Test
    @Category(CategorieRightBicep.class)
    public void aplicaDiscountVarstniciFakeRange(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Roma", 1000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(1000.00, pachetTuristic.getPret(), 0.0001);
    }
}