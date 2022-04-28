package ch.zli.m226b.api21a.firma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.zli.m226b.api21a.firma.util.TestPrinter;

class AbteilungsleiterTest {

	@Test
	void ohneMeisterTest() {
		Abteilungsleiter abteilungsLeiter = 
				new Abteilungsleiter("Max", 10);
		TestPrinter testPrinter = new TestPrinter();
		
		abteilungsLeiter.ausgeben(0, testPrinter);
		assertEquals("Max10", testPrinter.toString());
	}
	
	@Test
	void mitMeisterTest() {
		Abteilungsleiter abteilungsLeiter = 
				new Abteilungsleiter("Max", 10, true);
		TestPrinter testPrinter = new TestPrinter();
		
		abteilungsLeiter.ausgeben(0, testPrinter);
		assertEquals("Max10darf Lehrlinge ausbilden", testPrinter.toString());
	}

}
