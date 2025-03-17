package clase;

import Readers.AngajatiReader;
import Readers.EleviReader;
import Readers.StudentiReader;
import Readers.AplicantiReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		afiseazaAplicanti(new AngajatiReader("angajati.txt"));
		afiseazaAplicanti(new EleviReader("elevi.txt"));
		afiseazaAplicanti(new StudentiReader("studenti.txt"));
	}

	private static void afiseazaAplicanti(AplicantiReader reader) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = reader.readAplicanti();
			for (Aplicant aplicant : listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afiseazaFinantarePrimita();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Fisierul nu a fost gasit: " + reader.getClass().getSimpleName());
			e.printStackTrace();
		}
	}
}
