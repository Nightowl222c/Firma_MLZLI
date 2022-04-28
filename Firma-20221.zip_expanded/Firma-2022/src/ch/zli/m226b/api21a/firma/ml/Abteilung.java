package ch.zli.m226b.api21a.firma.ml;

import java.util.ArrayList;
import java.util.List;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

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
		if (arbeiter == null) { return; }
		mitarbeiterListe.add(arbeiter);
	}
	
	public void ausgeben(Printer printer, int indentation) {
		printer.print(indentation, "Abteilung", name);
		printer.print(indentation+1, "Abteilungsleiter");
		if (abteilungsLeiter != null) {
			abteilungsLeiter.ausgeben(printer, indentation+2);
		}
		for (var mitarbeiter : mitarbeiterListe) {
			printer.print(indentation+1, "Abt.mitarbeiter");
			mitarbeiter.ausgeben(printer, indentation+2);
		}
	}
}
