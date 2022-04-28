package ch.zli.m226b.api21a.firma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.zli.m226b.api21a.firma.util.TestPrinter;

class ManagerTest {

	@Test
	void ausgabeTest() {
		Manager manager = new Manager("Max", 10, "Porsche");
		TestPrinter testPrinter = new TestPrinter();
		manager.ausgeben(0, testPrinter);
		assertEquals("Max10Porsche", testPrinter.toString());
	}

}






