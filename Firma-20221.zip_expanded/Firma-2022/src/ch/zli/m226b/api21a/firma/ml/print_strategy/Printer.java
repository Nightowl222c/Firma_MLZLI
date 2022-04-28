package ch.zli.m226b.api21a.firma.ml.print_strategy;

/**
 * Print key/value pairs
 */
public interface Printer {

	/**
	 * Print a key with a given indentation.
	 * @param indentation the amount of indentation needed
	 * @param key the key to to be printed
	 */
	public void print(int indentation, String key);
	
	/**
	 * Print a key/value pair with a given indentation.
	 * @param indentation the amount of indentation needed
	 * @param key the key to to be printed
	 * @param value the value to be printed
	 */
	public void print(int indentation, String key, Object value);
}
