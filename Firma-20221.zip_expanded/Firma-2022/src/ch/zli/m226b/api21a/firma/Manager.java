package ch.zli.m226b.api21a.firma;

import ch.zli.m226b.api21a.firma.util.PrintStrategie;

public class Manager extends Mitarbeiter {
	private String fahrzeug;
	
	public Manager(String name, int salaer, String fahrzeug) {
		super(name, salaer);
		this.fahrzeug = fahrzeug;
	}

	@Override
	public void ausgeben(int inset, PrintStrategie printer) {
		super.ausgeben(inset, printer);
		printer.print(inset, "Firmenwagen", fahrzeug);
	}
}
