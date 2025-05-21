package Proxy.main;

import Proxy.model.Document;
import Proxy.model.ProxyDocumentPDF;

public class Program {
    public static void main(String[] args) {
        Document document = new ProxyDocumentPDF("prezentare_finala.pdf");
        System.out.println("Documentul a fost creat, dar nu e inca afisat");
        document.afiseaza();
        document.afiseaza();
    }
}
