/**
 * 
 */
package practice.java.io;

import java.io.PrintStream;

/**
 * @author Administrador
 *
 */
public class PrintStreamExample {

    public static void main(String[] args) {
	
	PrintStream ps = new PrintStream(System.out);
	ps.printf("Hello %s", "Albin");

    }

}
