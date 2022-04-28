package ch.zli.m226b.api21a.firma;

import java.util.ArrayList;
import java.util.List;

import ch.zli.m226b.api21a.firma.util.PrintStrategie;

public class Abteilung {
	private String name;
	private Mitarbeiter abteilungsLeiter;
	private List<Mitarbeiter> mitarbeiterListe;
	
	public Abteilung(String abteilungsName) {
		name = abteilungsName;
		abteilungsLeiter = null;
		mitarbeiterListe = new ArrayList<Mitarbeiter>();
	}
	
	public void setAbteilungsleiter(Mitarbeiter abteilungsLeiter) {
		this.abteilungsLeiter = abteilungsLeiter;
	}
	
	public void addMitarbeiter(Mitarbeiter arbeiter) {
		mitarbeiterListe.add(arbeiter);
	}
	
	public void ausgeben(int inset, PrintStrategie printer) {
		printer.print(inset, "Abteilung: ", name);
		printer.print(inset+1, "Abteilungsleiter:");
		if (abteilungsLeiter != null) {
			abteilungsLeiter.ausgeben(inset+2, printer);
		}
		for (var mitarbeiter : mitarbeiterListe) {
			printer.print(inset+1, "Abt.mitarbeiter:");
			mitarbeiter.ausgeben(inset+2, printer);
		}
	}
}
