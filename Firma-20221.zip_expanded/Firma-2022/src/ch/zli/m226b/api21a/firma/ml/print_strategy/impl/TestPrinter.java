package ch.zli.m226b.api21a.firma.ml.print_strategy.impl;

import java.util.Stack;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

public class TestPrinter implements Printer {
	private Stack<Integer> indentationStack;
	private StringBuffer buffer;

	public TestPrinter() {
		indentationStack = new Stack<>();
		indentationStack.push(-1);
		buffer = new StringBuffer();
	}
	
	public String toString() {
		while(indentationStack.peek() != -1) {
			buffer.append("}");
			indentationStack.pop();
		}
		return buffer.toString();
	}
	
	@Override
	public void print(int indentation, String key) { /* do nothing */ }

	@Override
	public void print(int indentation, String key, Object value) {
		
		if (indentation < indentationStack.peek()) {
			buffer.append("}");
			indentationStack.pop();
		}
		if (indentationStack.peek() < indentation) {
			buffer.append("{");
			indentationStack.push(indentation);
		}
		buffer.append(value + "::");
	}
}
