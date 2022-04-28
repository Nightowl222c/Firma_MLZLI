package ch.zli.m226b.api21a.firma.util;

public class ConsolePrinter implements PrintStrategie {

	private final static String prefix = "  ";
	
	@Override
	public void print(int inset, String key) {
		print(inset, key, "");
	}

	@Override
	public void print(int inset, String key, Object value) {
		for (int i = 0; i < inset; i++) {
			System.out.print(prefix);
		}
		System.out.println(key + " " + value);
	}

}
