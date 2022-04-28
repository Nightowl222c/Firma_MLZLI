package ch.zli.m226b.api21a.firma.ml;

import ch.zli.m226b.api21a.firma.ml.print_strategy.impl.ConsolePrinter;
import ch.zli.m226b.api21a.firma.ml.print_strategy.impl.JsonPrinter;
import ch.zli.m226b.api21a.firma.ml.print_strategy.impl.SimpleTestPrinter;
import ch.zli.m226b.api21a.firma.ml.print_strategy.impl.TestPrinter;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma("Müller electronics GmbH");
		firma.setChef(new Manager("Müller", 300000, "Porsche"));
		
		Abteilung verkauf = new Abteilung("Verkauf");
		verkauf.setAbteilungsleiter(new Abteilungsleiter("Kählin", 120000, false));
		verkauf.addMitarbeiter(new Mitarbeiter("Bisig", 75000));

		Abteilung produktion = new Abteilung("Produktion");
		produktion.setAbteilungsleiter(new Abteilungsleiter("Mäder", 10000, true));
		produktion.addMitarbeiter(new ProduktionsMitarbeiter("Güttinger", 85000));
		produktion.addMitarbeiter(new ProduktionsMitarbeiter("Ebert", 83000, true));
		
		firma.addAbteilung(verkauf);
		firma.addAbteilung(produktion);

		ConsolePrinter consolePrinter = new ConsolePrinter();
		firma.organigrammAusgeben(consolePrinter);

		JsonPrinter printer = new JsonPrinter();
		firma.organigrammAusgeben(printer);
		System.out.println(printer.getJson());
				
		printer = new JsonPrinter(false);
		firma.organigrammAusgeben(printer);
		System.out.println(printer.getJson());

		System.out.println();
		
		SimpleTestPrinter simpleTestPrinter = new SimpleTestPrinter();
		new Mitarbeiter("Müller", 300000).ausgeben(simpleTestPrinter, 0);
		System.out.println(simpleTestPrinter);
				
		simpleTestPrinter = new SimpleTestPrinter();
		verkauf.addMitarbeiter(null);
		verkauf.ausgeben(simpleTestPrinter, 0);
		System.out.println(simpleTestPrinter);
		
		simpleTestPrinter = new SimpleTestPrinter();
		firma.addAbteilung(null);
		firma.organigrammAusgeben(simpleTestPrinter);
		System.out.println(simpleTestPrinter);
		
		System.out.println();
		
		TestPrinter testPrinter = new TestPrinter();
		new Mitarbeiter("Müller", 300000).ausgeben(testPrinter, 0);
		System.out.println(testPrinter);
				
		testPrinter = new TestPrinter();
		verkauf.addMitarbeiter(null);
		verkauf.ausgeben(testPrinter, 0);
		System.out.println(testPrinter);
		
		testPrinter = new TestPrinter();
		firma.addAbteilung(null);
		firma.organigrammAusgeben(testPrinter);
		System.out.println(testPrinter);
	}
}
