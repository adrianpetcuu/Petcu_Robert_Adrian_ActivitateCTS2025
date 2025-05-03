package exemplul3.program;

import exemplul3.clase.Document;
import exemplul3.clase.IDocument;
import exemplul3.proxy.ProxyDocument;

public class Program {
    public static void main(String[] args) {
        Document documentPublic = new Document("Ghid angajati", "public");
        Document documentConfidential = new Document("Plan de afaceri 2025", "confidential");

        IDocument proxyPublic = new ProxyDocument(documentPublic);
        IDocument proxyConfidential = new ProxyDocument(documentConfidential);

        proxyPublic.citeste("Alex Pop", "analist");
        proxyPublic.citeste("Andrei Preda", "manager");
        proxyConfidential.citeste("Alex Pop", "analist");
        proxyConfidential.citeste("Andrei Preda", "manager");
    }
}
