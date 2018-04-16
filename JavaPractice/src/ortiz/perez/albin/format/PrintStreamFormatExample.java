/**
 * 
 */
package ortiz.perez.albin.format;

import java.io.PrintStream;

/**
 * @author apobits@gmail.com
 *
 */
public class PrintStreamFormatExample {

    public static void main(String[] args) {

	// formatting using PrintStream's format method
	System.out.format("float with 3 decimals %.3f", 1234.1234f);

	System.out.println();

	PrintStream p = new PrintStream(System.out);
	p.format("float with 3 decimals %.3f", 1234.1234f);

	System.out.println();

	// formatting using PrintStream's printf method
	System.out.printf("float with 3 decimals %.3f", 1234.1234f);

	System.out.println();

	p.printf("float with 3 decimals %.3f", 1234.1234f);

    }

}
