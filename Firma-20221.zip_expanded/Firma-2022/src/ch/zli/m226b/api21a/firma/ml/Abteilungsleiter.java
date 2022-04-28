package ch.zli.m226b.api21a.firma.ml;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

public class Abteilungsleiter extends Mitarbeiter {

	private boolean istMeister;

	public Abteilungsleiter(String name, int salaer, boolean istMeister) {
		super(name, salaer);
		this.istMeister = istMeister;
	}

	@Override
	public void ausgeben(Printer printer, int indentation) {
		super.ausgeben(printer, indentation);
		if (istMeister) {
			printer.print(indentation, "Darf Lehrlinge ausbilden");
		}
	}
}
