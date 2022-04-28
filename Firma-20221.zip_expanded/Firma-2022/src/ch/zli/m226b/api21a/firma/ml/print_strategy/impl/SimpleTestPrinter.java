package ch.zli.m226b.api21a.firma.ml.print_strategy.impl;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

public class SimpleTestPrinter implements Printer {
	private StringBuffer buffer;

	public SimpleTestPrinter() {
		buffer = new StringBuffer();
	}
	
	public String toString() {
		return buffer.toString();
	}
	
	@Override
	public void print(int indentation, String key) { /* do nothing */ }

	@Override
	public void print(int indentation, String key, Object value) {
		buffer.append(value);
	}
}
