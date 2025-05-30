package teste;

import clase.Biblioteca;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    Biblioteca bib;

    @BeforeEach
    void setup() {
        bib = new Biblioteca();
        bib.adaugaCarte("Java 101");
        bib.adaugaCarte("Clean Code");
    }

    // RIGHT – rezultatul corect
    @Test
    void testImprumutCorect() {
        assertTrue(bib.imprumutaCarte("Java 101", "Andrei"));
        assertFalse(bib.esteDisponibila("Java 101"));
        assertEquals("Andrei", bib.cineAreCartea("Java 101"));
    }

    // B – Boundary: fara nicio carte
    @Test
    void testBibliotecaGoala() {
        Biblioteca goala = new Biblioteca();
        assertEquals(0, goala.numarCartiDisponibile());
    }

    // I – Inverse: imprumuti, returnezi, verifici disponibilitatea
    @Test
    void testReturnareDupaImprumut() {
        bib.imprumutaCarte("Clean Code", "Maria");
        bib.returneazaCarte("Clean Code");
        assertTrue(bib.esteDisponibila("Clean Code"));
    }

    // C – Cross-check: numarul total = disponibile + imprumutate
    @Test
    void testCrossCheckTotalCarti() {
        bib.imprumutaCarte("Clean Code", "Maria");
        int total = bib.numarCartiDisponibile() + bib.numarCartiImprumutate();
        assertEquals(2, total);
    }

    // E – Error: titlu null sau gol
    @Test
    void testAdaugaTitluInvalid() {
        assertThrows(IllegalArgumentException.class, () -> bib.adaugaCarte(null));
        assertThrows(IllegalArgumentException.class, () -> bib.adaugaCarte(""));
    }

    // E – Error: imprumut invalid
    @Test
    void testImprumutTitluInexistent() {
        assertFalse(bib.imprumutaCarte("Nu exista", "Andrei"));
    }

    @Test
    void testImprumutUtilizatorGol() {
        assertFalse(bib.imprumutaCarte("Java 101", ""));
    }

    // P – Performance
    @Test
    void testPerformantaImprumutMulteCarti() {
        for (int i = 0; i < 1000; i++) {
            bib.adaugaCarte("Carte " + i);
        }
        assertTimeout(java.time.Duration.ofMillis(50), () -> {
            bib.imprumutaCarte("Carte 999", "Gigel");
        });
    }

    // Alte teste utile
    @Test
    void testReturneazaCarteInexistenta() {
        assertFalse(bib.returneazaCarte("Cartea nu e aici"));
    }

    @Test
    void testNumarCartiDisponibileDupaAdaugare() {
        bib.adaugaCarte("Design Patterns");
        assertEquals(3, bib.numarCartiDisponibile());
    }

    @Test
    void testImprumutaDeDouaOri() {
        bib.imprumutaCarte("Java 101", "Alina");
        boolean rezultat = bib.imprumutaCarte("Java 101", "Ion");
        assertFalse(rezultat); // nu mai e disponibila
    }
}
