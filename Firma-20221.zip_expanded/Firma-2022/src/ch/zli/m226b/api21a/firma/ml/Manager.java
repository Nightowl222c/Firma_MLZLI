package ch.zli.m226b.api21a.firma.ml;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

public class Manager extends Mitarbeiter {

	private String auto;

	public Manager(String name, int salaer, String auto) {
		super(name, salaer);
		this.auto = auto;
	}

	@Override
	public void ausgeben(Printer printer, int indentation) {
		super.ausgeben(printer, indentation);
		printer.print(indentation, "Firmenwagen", auto);
	}
}
