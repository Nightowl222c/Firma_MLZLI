package ch.zli.m226b.api21a.firma;

public class ProduktionsMitarbeiter extends Mitarbeiter {

	public ProduktionsMitarbeiter(String name, int salaer) {
		this(name, salaer, false);
	}
	public ProduktionsMitarbeiter(String name, int salaer, boolean hatIpa) {
		// if hatIpa : salaer = salaer / 13 *14 
		super(
				name, 
				hatIpa ? salaer = (int)(salaer / 13.0 * 14) : salaer 
			);
	}

}
