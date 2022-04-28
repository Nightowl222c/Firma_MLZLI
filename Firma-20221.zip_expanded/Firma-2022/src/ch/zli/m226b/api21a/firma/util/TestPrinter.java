package ch.zli.m226b.api21a.firma.util;

public class TestPrinter implements PrintStrategie {
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void print(int inset, String key) {
		// do nothing
	}

	@Override
	public void print(int inset, String key, Object value) {
		buffer.append(value.toString());
	}

	@Override
	public String toString() {
		return buffer.toString();
	}
}
