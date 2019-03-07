/**
 * 
 */
package practice.java.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Administrador
 *
 */
public class PrintStreamExample {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream ps = System.out;
		ps.printf("Hello %s", "Albin");

		try (PrintStream ps1 = new PrintStream("Valid file")) {
			ps1.println(" Hello you ");
		}

	}

}
