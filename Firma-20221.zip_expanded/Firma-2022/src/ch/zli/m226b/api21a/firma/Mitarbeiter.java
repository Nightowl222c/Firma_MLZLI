package ch.zli.m226b.api21a.firma;

import ch.zli.m226b.api21a.firma.util.PrintStrategie;

public class Mitarbeiter {
	private String name;
	private int salaer;
	private int mitarbeiterNummer;
	
	public Mitarbeiter(String name, int salaer) {
		this.name = name;
		this.salaer = salaer;
		mitarbeiterNummer = getNextMbNummer();
	}

	public void ausgeben(int inset, PrintStrategie printer) {
		printer.print(inset, "Name: ", name);
		printer.print(inset, "Salär: ", salaer);
	}
	
	private static int nextMbNummer = 1;
	private static int getNextMbNummer() {
		return nextMbNummer++;
	}
}
