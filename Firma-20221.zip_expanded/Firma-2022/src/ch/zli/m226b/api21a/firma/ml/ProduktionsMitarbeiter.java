package ch.zli.m226b.api21a.firma.ml;

public class ProduktionsMitarbeiter extends Mitarbeiter {

	public ProduktionsMitarbeiter(String name, int salaer) {
		this(name, salaer, false);
	}
	public ProduktionsMitarbeiter(String name, int salaer, boolean hatEfz) {
		super(name, hatEfz ? (int)(14/13.0*salaer) : salaer);
	}
}
