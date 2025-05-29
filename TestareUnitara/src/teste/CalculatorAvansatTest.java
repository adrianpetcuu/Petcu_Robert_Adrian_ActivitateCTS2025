package teste;

import clase.CalculatorAvansat;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAvansatTest {

    CalculatorAvansat calc = new CalculatorAvansat();
    
    @Test
    void testAdunareCorecta() {
        assertEquals(10, calc.aduna(4, 6));
    }

    @Test
    void testPutereLimitaZeroExponent() {
        assertEquals(1, calc.ridicaLaPutere(10, 0));
    }


    @Test
    void testInmultireSiImpartireInverse() {
        int a = 6, b = 3;
        int produs = calc.inmulteste(a, b);
        double impartire = calc.imparte(produs, b);
        assertEquals(a, impartire);
    }


    @Test
    void testRidicareLaPutereCrossCheck() {
        int rezultat = calc.ridicaLaPutere(2, 3);
        assertEquals(2 * 2 * 2, rezultat);
    }

    @Test
    void testImpartireLaZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.imparte(10, 0);
        });
    }

    @Test
    void testExponentNegativ() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.ridicaLaPutere(2, -3);
        });
    }

    @Test
    void testRadicalNegativ() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.radical(-4);
        });
    }

    @Test
    void testPerformantaRadical() {
        assertTimeout(java.time.Duration.ofMillis(10), () -> {
            calc.radical(1000000);
        });
    }
}
