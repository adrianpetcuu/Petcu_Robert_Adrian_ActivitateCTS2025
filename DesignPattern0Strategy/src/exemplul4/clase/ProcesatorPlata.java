package exemplul4.clase;

public class ProcesatorPlata {
    private StrategieFiscala strategieFiscala;

    public ProcesatorPlata(StrategieFiscala strategieFiscala){
        this.strategieFiscala = strategieFiscala;
    }

    public void setStrategieFiscala(StrategieFiscala strategieFiscala){
        this.strategieFiscala = strategieFiscala;
    }

    public void proceseazaPlata(String codFiscal, double suma){
        System.out.println("=== Procesare plata ===");
        if (!strategieFiscala.valideazaCodFiscal(codFiscal)) {
            System.out.println("Cod fiscal invalid");
            return;
        }
        double total = strategieFiscala.calculeazaTotalCuTaxe(suma);
        System.out.println("Total cu taxe: " + total + " RON.");
        System.out.println(strategieFiscala.genereazaMesajConfirmare(codFiscal, suma));

    }
}
