package teste;

import clase.ContBancar;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ContBancarTest {

    ContBancar cont;

    @BeforeEach
    void setup() {
        cont = new ContBancar("Andrei Popescu", 1000.0);
    }

    // R - RIGHT
    @Test
    void testDepunereCorecta() {
        cont.depune(500);
        assertEquals(1500, cont.getSold());
    }

    @Test
    void testRetragereCorecta() {
        cont.retrage(300);
        assertEquals(700, cont.getSold());
    }

    // B - BOUNDARY
    @Test
    void testRetragereExactSold() {
        cont.retrage(1000);
        assertEquals(0, cont.getSold());
    }

    @Test
    void testDepunereMinima() {
        cont.depune(0.01);
        assertEquals(1000.01, cont.getSold());
    }

    // I - INVERSE
    @Test
    void testDepunereSiRetragereInverse() {
        cont.depune(200);
        cont.retrage(200);
        assertEquals(1000, cont.getSold());
    }

    // C - CROSS-CHECK
    @Test
    void testTransferCrossCheck() {
        ContBancar destinatie = new ContBancar("Maria Ionescu", 500);
        boolean rezultat = cont.transferaLa(destinatie, 200);
        assertTrue(rezultat);
        assertEquals(800, cont.getSold());
        assertEquals(700, destinatie.getSold());
    }

    // E - ERROR CONDITIONS
    @Test
    void testDepunereSumaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> cont.depune(-100));
    }

    @Test
    void testRetragereFonduriInsuficiente() {
        assertThrows(IllegalArgumentException.class, () -> cont.retrage(2000));
    }

    @Test
    void testRetragereContInchis() {
        cont.inchideCont();
        assertThrows(IllegalStateException.class, () -> cont.retrage(100));
    }

    // P - PERFORMANCE (doar simulativ)
    @Test
    void testTransferRapid() {
        ContBancar c2 = new ContBancar("Ion", 1000);
        assertTimeout(java.time.Duration.ofMillis(10), () -> cont.transferaLa(c2, 100));
    }

    // Test suplimentar pentru inchidere cont
    @Test
    void testInchidereCont() {
        cont.inchideCont();
        assertFalse(cont.esteActiv());
    }

    // Test creare cont cu sold negativ (EROARE)
    @Test
    void testConstructorSoldNegativ() {
        assertThrows(IllegalArgumentException.class, () -> new ContBancar("Test", -50));
    }

    // Test transfer esuat catre cont inactiv
    @Test
    void testTransferCatreContInactiv() {
        ContBancar destinatie = new ContBancar("Test", 100);
        destinatie.inchideCont();
        boolean rezultat = cont.transferaLa(destinatie, 100);
        assertFalse(rezultat);
    }

    // Test transfer cu suma negativa
    @Test
    void testTransferSumaNegativa() {
        ContBancar destinatie = new ContBancar("Dest", 100);
        boolean rezultat = cont.transferaLa(destinatie, -50);
        assertFalse(rezultat);
    }
}
