package teste;

import categorii.CategorieCorrect;
import categorii.CategorieRightBicep;
import clase.IPersoana;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetVarstaTest {
    @Test
    @Category(CategorieCorrect.class)
    public void getVarstaOrderTest() {
        IPersoana persoana1 = new Persoana("Andrei", "5003212383829");
        IPersoana persoana2 = new Persoana("Mihai", "1923212383829");

        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test
    @Category(CategorieRightBicep.class)
    public void getVarstaRight(){
        IPersoana persoana = new Persoana("Ana", "6030216567845");
        assertEquals(22, persoana.getVarsta());
    }
}