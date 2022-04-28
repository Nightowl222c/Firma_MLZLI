package ch.zli.m226b.api21a.firma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.zli.m226b.api21a.firma.util.TestPrinter;

class AbteilungTest {

	@Test
	void leere_abteilung() {
		Abteilung abteilung = new Abteilung("Verkauf");
		TestPrinter testPrinter = new TestPrinter();
		abteilung.ausgeben(0, testPrinter);
		assertEquals("Verkauf", testPrinter.toString());
	}

	@Test
	void geleitete_abteilung() {
		Abteilung abteilung = new Abteilung("Verkauf");
		abteilung.setAbteilungsleiter(new Mitarbeiter("Max", 10));
		TestPrinter testPrinter = new TestPrinter();
		abteilung.ausgeben(0, testPrinter);
		assertEquals("VerkaufMax10", testPrinter.toString());
	}
	
	@Test
	void mitarbeiter_in_abteilung() {
		Abteilung abteilung = new Abteilung("Verkauf");
		abteilung.addMitarbeiter(new Mitarbeiter("Max", 10));
		abteilung.addMitarbeiter(new Mitarbeiter("Trax", 11));
		TestPrinter testPrinter = new TestPrinter();
		abteilung.ausgeben(0, testPrinter);
		assertEquals("VerkaufMax10Trax11", testPrinter.toString());
	}
	
	@Test
	void leiter_und_miarbeiter_in_abteilung() {
		Abteilung abteilung = new Abteilung("Verkauf");
		abteilung.setAbteilungsleiter(new Mitarbeiter("Chef", 13));
		abteilung.addMitarbeiter(new Mitarbeiter("Max", 10));
		abteilung.addMitarbeiter(new Mitarbeiter("Trax", 11));
		TestPrinter testPrinter = new TestPrinter();
		abteilung.ausgeben(0, testPrinter);
		assertEquals("VerkaufChef13Max10Trax11", testPrinter.toString());
	}
}
