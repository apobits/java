/**
 * 
 */
package ortiz.perez.albin.scanner;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class ScannerExample {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);// Scanner constructor that
					      // receives an InputStream object
	System.out.println(scan.delimiter().toString());// prints the scanner's
							// delimiters

	scan.useDelimiter(",. ");

	System.out.println(scan.delimiter().toString());// prints the scanner's
							// delimiters

	scan.close();// closes the scanner object

	String word = "1,2,3,4,5";

	Scanner scan1 = new Scanner(word);

	scan1.useDelimiter(",");

	while (scan1.hasNext()) {
	    System.out.print(scan1.nextInt());
	}

	scan1.close();

	Scanner scanner3 = new Scanner("Name Albin, LastName Perez");

	scanner3.findInLine("Name");// gets to the matched token
	System.out.println(scanner3.next());// gets the next token after one
					    // finde before

	scanner3.close();

    }

}
