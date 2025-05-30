package clase;

import java.util.*;

public class Biblioteca {
    private List<String> cartiDisponibile;
    private Map<String, String> imprumuturi; // carte → utilizator

    public Biblioteca() {
        cartiDisponibile = new ArrayList<>();
        imprumuturi = new HashMap<>();
    }

    public void adaugaCarte(String titlu) {
        if (titlu == null || titlu.isEmpty()) {
            throw new IllegalArgumentException("Titlul nu poate fi null sau gol.");
        }
        cartiDisponibile.add(titlu);
    }

    public boolean esteDisponibila(String titlu) {
        return cartiDisponibile.contains(titlu);
    }

    public boolean imprumutaCarte(String titlu, String utilizator) {
        if (!cartiDisponibile.contains(titlu) || utilizator == null || utilizator.isEmpty()) {
            return false;
        }
        imprumuturi.put(titlu, utilizator);
        cartiDisponibile.remove(titlu);
        return true;
    }

    public boolean returneazaCarte(String titlu) {
        if (!imprumuturi.containsKey(titlu)) {
            return false;
        }
        imprumuturi.remove(titlu);
        cartiDisponibile.add(titlu);
        return true;
    }

    public String cineAreCartea(String titlu) {
        return imprumuturi.get(titlu);
    }

    public int numarCartiDisponibile() {
        return cartiDisponibile.size();
    }

    public int numarCartiImprumutate() {
        return imprumuturi.size();
    }
}

