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
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
			scanner.close();
		}
		

	}

	public static void main(String args[]) {
		Reader reader = new Reader();
		reader.read();
	}

}
