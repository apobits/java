/**
 * 
 */
package practice.java.io;

import java.io.PrintWriter;

/**
 * @author apobits@gmail.com
 *
 */
public class PrintWriterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (PrintWriter pw = new PrintWriter(System.out)) {
			pw.printf("Hello %s your id is %d", "Albin", 16055133);
			pw.flush();
		}
	}

}
