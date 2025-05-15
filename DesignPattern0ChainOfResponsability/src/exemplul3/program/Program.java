package exemplul3.program;

import exemplul3.clase.*;

public class Program {
    public static void main(String[] args) {
        Verificator fonduri = new VerificareFonduri();
        Verificator frauda = new VerificareFrauda();
        Verificator limitaZilnica = new VerificareLimitaZilnica();
        Verificator inregistrareTranzactie = new InregistrareTranzactie();

        fonduri.setUrmatorul(frauda);
        frauda.setUrmatorul(limitaZilnica);
        limitaZilnica.setUrmatorul(inregistrareTranzactie);

        Tranzactie t1 = new Tranzactie("Ion Popescu", 1500, 3000, false, 5000);
        Tranzactie t2 = new Tranzactie("Maria Stan", 25000, 40000, true, 18000);
        Tranzactie t3 = new Tranzactie("George Enache", 8000, 5000, false, 2000);

        System.out.println("--- Verificare t1 ---");
        fonduri.verifica(t1);
        System.out.println("--- Verificare t2 ---");
        fonduri.verifica(t2);
        System.out.println("--- Verificare t3 ---");
        fonduri.verifica(t3);
    }
}
