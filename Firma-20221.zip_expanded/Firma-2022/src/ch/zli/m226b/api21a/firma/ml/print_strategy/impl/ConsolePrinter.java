package ch.zli.m226b.api21a.firma.ml.print_strategy.impl;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

public class ConsolePrinter implements Printer {
	private final String prefix;

	public ConsolePrinter() { prefix = "  "; }
	
	@Override
	public void print(int indentation, String key) {
		print(indentation, key, "");
	}

	@Override
	public void print(int indentation, String key, Object value) {
		indent(indentation);
		System.out.println(key + ": " + value);
		
	}

	private void indent(int indentation) {
		for (int i = 0; i < indentation; i++) {
			System.out.print(prefix);
		}
	}

}
