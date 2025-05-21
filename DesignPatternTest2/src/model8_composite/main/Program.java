package model8_composite.main;

import model8_composite.model.CppClass;
import model8_composite.model.CppFunction;

public class Program {
    public static void main(String[] args) {
        CppFunction f1 = new CppFunction("safeFunc", "int a = 0;");
        CppFunction f2 = new CppFunction("unsafeFunc", "gets(buf);");

        CppClass sub1 = new CppClass("SubClass1");
        try {
            sub1.adaugaNod(new CppFunction("func1", "int x = 1;"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        CppClass sub2 = new CppClass("SubClass2");
        try {
            sub2.adaugaNod(new CppFunction("func2", "strcpy(dst, src);"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        CppClass mainClass = new CppClass("MainClass");
        try {
            mainClass.adaugaNod(f1);
            mainClass.adaugaNod(f2);
            mainClass.adaugaNod(sub1);
            mainClass.adaugaNod(sub2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("=== Parsing full class ===");
        try {
            mainClass.parcurge();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n=== Parsing only one function ===");
        f2.parcurge();
    }
}

