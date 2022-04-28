package ch.zli.m226b.api21a.firma;

import ch.zli.m226b.api21a.firma.util.TestPrinter;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma("Müller electronics GmbH");
		firma.setChef(new Manager("Müller", 300000, "Audi"));
		
		Abteilung verkauf = new Abteilung("Verkauf");
		Mitarbeiter abtLeiter = new Abteilungsleiter("Kählin", 120000);
		verkauf.setAbteilungsleiter(abtLeiter);
		verkauf.addMitarbeiter(new Mitarbeiter("Bisig", 75000));

		Abteilung produktion = new Abteilung("Produktion");
		produktion.setAbteilungsleiter(new Abteilungsleiter("Mäder", 100000, true));
		produktion.addMitarbeiter(new ProduktionsMitarbeiter("Güttinger", 85000, true));
		produktion.addMitarbeiter(new ProduktionsMitarbeiter("Ebert", 83000));
		
		firma.addAbteilung(verkauf);
		firma.addAbteilung(produktion);
		
//		firma.organigrammAusgeben(new ConsolePrinter());
//		firma.organigrammAusgeben(new TestPrinter());
//		
		abtLeiter.ausgeben(0, new TestPrinter());
	}
}
