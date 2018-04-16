/**
 * 
 */
package practice.java.io;

import java.io.Console;

/**
 * @author apobits@gmail.com
 *
 */
public class ConsoleExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Console console = System.console();
	if (console == null) {
	    System.out.println("No console available");
	    return;
	}
	System.out.println("Type in your name");
	String msg = console.readLine();
	console.printf("Hello %s", msg);

    }

}
