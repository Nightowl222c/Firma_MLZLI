package ch.zli.m226b.api21a.firma.ml;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

public class Mitarbeiter {
	private String name;
	private int salaer;
//	private int mitarbeiterNummer;
	
	public Mitarbeiter(String name, int salaer) {
		this.name = name;
		this.salaer = salaer;
//		mitarbeiterNummer = getNextMbNummer();
	}

	public void ausgeben(Printer printer, int indentation) {
//		printer.print(indentation, "mId", mitarbeiterNummer);
		printer.print(indentation, "Name", name);
		printer.print(indentation, "Salär", salaer);
	}
	
//	private static int nextMbNummer = 1;
//	private static int getNextMbNummer() {
//		return nextMbNummer++;
//	}
}
