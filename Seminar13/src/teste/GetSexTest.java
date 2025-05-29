package teste;

import clase.Persoana;
import exceptii.ExceptieCNPInvalid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetSexTest {

    @Test
    public void getSexRIGHTmasculin() {
        Persoana persoana = new Persoana("Ion", "5030303131415");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexRIGHTfeminin(){
        Persoana persoana = new Persoana("Ana", "6030303134567");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexBoundaryInferior(){
        Persoana persoana = new Persoana("Ion", "1980203345678");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexBoundarySuperior(){
        Persoana persoana = new Persoana("Mihai", "8980303193845");
        assertEquals("F", persoana.getSex());
    }

    private String getSexParitate(String CNP){
        if(CNP.charAt(0) % 2 == 0){
            return "F";
        } else {
            return "M";
        }
    }

    @Test
    public void getSexCrossCheck(){
        String CNP = "5010101121212";
        Persoana persoana = new Persoana("Ionut", CNP);
        assertEquals(getSexParitate(CNP), persoana.getSex());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getSexEroare(){
        Persoana persoana = new Persoana("Ion", "9040404202020");
        persoana.getSex();

    }
}