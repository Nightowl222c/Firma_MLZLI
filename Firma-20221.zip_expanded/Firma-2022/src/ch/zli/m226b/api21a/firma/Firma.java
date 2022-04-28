package ch.zli.m226b.api21a.firma;

import java.util.ArrayList;
import java.util.List;

import ch.zli.m226b.api21a.firma.util.PrintStrategie;

public class Firma {
	private String name;
	private Mitarbeiter chef;
	private List<Abteilung> abteilungen;
	
	public Firma(String firmenName) {
		chef = null;
		name = firmenName;
		abteilungen = new ArrayList<>();
	}
	
	public void setChef(Mitarbeiter mitarbeiter) {
		chef = mitarbeiter;
	}
	
	public void addAbteilung(Abteilung abteilung) {
		abteilungen.add(abteilung);
	}
	
	public void organigrammAusgeben(PrintStrategie printer) {
		printer.print(0, "Firmenname: ", name);
		printer.print(1, "Firmenchef ist:");
		chef.ausgeben(2, printer);
		printer.print(1, "Unsere Abteilungen:");
		for (var abteilung : abteilungen) {
			abteilung.ausgeben(2, printer);
		}
	}
}










