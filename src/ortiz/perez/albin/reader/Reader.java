/**
 * 
 */
package ortiz.perez.albin.reader;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class Reader {

	public void read() {
		Scanner scanner = new Scanner(System.in);
			System.out.println(scanner.nextLine());
			System.out.println(scanner.hasNext());
			System.out.println(scanner.hasNext());

			scanner.close();
		

	}

	public static void main(String args[]) {
		Reader reader = new Reader();
		reader.read();
	}

}
