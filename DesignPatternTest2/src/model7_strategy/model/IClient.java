package model7_strategy.model;

import java.util.List;

public interface IClient {
    void setStrategie(ICautare strategie);
    List<Produs> cautaProduse(List<Produs> produse);
}
