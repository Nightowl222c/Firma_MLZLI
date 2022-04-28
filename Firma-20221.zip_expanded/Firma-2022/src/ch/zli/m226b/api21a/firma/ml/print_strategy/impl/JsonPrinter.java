package ch.zli.m226b.api21a.firma.ml.print_strategy.impl;

import java.util.Stack;

import ch.zli.m226b.api21a.firma.ml.print_strategy.Printer;

/**
 * JsonPrinter implements {@link Printer} to generate a JSON string
 * </br>
 * Note that we do not implement array printing
 */
public class JsonPrinter implements Printer {

	private final boolean prettyPrint;
	private StringBuffer buffer;
	private Stack<Integer> indentationStack;
	
	/** 
	 * Constructor
	 * </br> format wit one TAB by default
	 */
	public JsonPrinter() { this(true); }
	
	/**
	 * Constructor
	 * @param prettyPrint if true format with one TAB, no formatting otherwise
	 */
	public JsonPrinter(boolean prettyPrint) {
		this.prettyPrint = prettyPrint;
		buffer = new StringBuffer();
		indentationStack = new Stack<>();
		indentationStack.push(-1);
	}
	
	/**
	 * You have to call {@link #getJson()} at the end of use
	 * to output the remaining curly braces
	 * and get the generated String
	 * @return the generated String in JSON format
	 */
	public String getJson() {
		outputCloseCurlibrace(-1);
		return buffer.toString();
	}

	@Override
	public void print(int indentation, String key) {
		processCurliBraces(indentation);
		buffer.append("\"" + key + "\"" + ": ");
		printNewline();
	}

	@Override
	public void print(int indentation, String key, Object value) {
		processCurliBraces(indentation);
		buffer.append("\"" + key + "\"" + ": ");
		if (value instanceof String) {
			buffer.append("\"" + value + "\"");
		} else {
			buffer.append(value);
		}
		buffer.append(", ");
		printNewline();
	}
	
	private void outputOpenCurlibrace(int indentation) {
		if (indentation > this.indentationStack.peek()) {
			if (buffer.length() > 0 && prettyPrint) {
				buffer.delete(buffer.length()-1, buffer.length());
			}
			buffer.append("{");
			printNewline();
			this.indentationStack.push(indentation);
		}
	}
	
	private void processCurliBraces(int indentation) {
		outputCloseCurlibrace(indentation);
		outputOpenCurlibrace(indentation);
		outputWhitespace(indentation+1);
	}

	private void outputCloseCurlibrace(int indentation) {
		removeTrailingComma(indentation);
		while (indentation < indentationStack.peek()) {
			outputWhitespace(indentationStack.peek());
			buffer.append("}");
			if (!prettyPrint) { buffer.append(" "); }
			printNewline();
			indentationStack.pop();
		}
	}
	
	private void removeTrailingComma(int indentation) {
		if (indentation < indentationStack.peek()) {
			buffer.delete(buffer.length()-3, buffer.length()-1);
		}
	}

	private void outputWhitespace(int indentation) {
		if (!prettyPrint) { return; }
		
		for (int i = 0; i < indentation; i++) {
			buffer.append("\t");
		}
	}

	private void printNewline() {
		if (prettyPrint) {
			buffer.append("\n");
		}
	}
}
