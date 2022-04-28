package ch.zli.m226b.api21a.firma;

import ch.zli.m226b.api21a.firma.util.PrintStrategie;

public class Abteilungsleiter extends Mitarbeiter {

	private boolean istMeister;

	public Abteilungsleiter(String name, int salaer) {
		this(name, salaer, false);
	}
	public Abteilungsleiter(String name, int salaer, boolean istMeister) {
		super(name, salaer);
		this.istMeister = istMeister;
	}

	@Override
	public void ausgeben(int inset, PrintStrategie printer) {
		super.ausgeben(inset, printer);
		if (istMeister) {
			printer.print(inset, "", "darf Lehrlinge ausbilden");
		}
	}
}
