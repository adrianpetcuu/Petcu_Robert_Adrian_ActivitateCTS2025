package model6_chainOfResponsability.model;


import java.util.List;

public interface ICautare {
    void setUrmator(ICautare urmator);
    List<Produs> filtreaza(List<Produs> produse, FiltruParametri parametri);
}
