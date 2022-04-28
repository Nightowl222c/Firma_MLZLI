package ch.zli.m226b.api21a.firma.ml;

import java.util.ArrayList;
import java.util.List;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;
/**
 * Hauptklasse zur Verwaltung einer Firma
 */
public class Firma {
	private String name;
	private Mitarbeiter chef;
	private List<Abteilung> abteilungen;
	
	/**
	 * Costructor
	 * @param firmenName der Name der Firma
	 */
	public Firma(String firmenName) {
		chef = null;
		name = firmenName;
		abteilungen = new ArrayList<>();
	}
	
	public void setChef(Mitarbeiter mitarbeiter) {
		chef = mitarbeiter;
	}
	
	public void addAbteilung(Abteilung abteilung) {
		if (abteilung == null) { return; }
		abteilungen.add(abteilung);
	}
	
	public void organigrammAusgeben(Printer printer) {
		printer.print(0, "Firmenname", name);
		printer.print(1, "Firmenchef ist");
		if (chef != null) {
			chef.ausgeben(printer, 2);
		}
		printer.print(1, "Unsere Abteilungen");
		for (var abteilung : abteilungen) {
			abteilung.ausgeben(printer, 2);
		}
	}
}










