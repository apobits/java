/**
 * 
 */
package practice.java.io;

import java.io.Console;

/**
 * @author apobits@gmail.com
 *
 */
public class ConsoledExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console console = System.console();

		if (console == null) {
			// terminates the currently running java virtual machine
			System.exit(1);
		}

		StringBuilder sb = new StringBuilder();
		String line;
		do {
			line = console.readLine();
			sb.append(line);
		} while (!line.equalsIgnoreCase("exit"));

		System.out.println(sb);

	}

}
