/**
 * 
 */
package ortiz.perez.albin.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrador
 *
 */
public class BufferedReaderConsoleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		char c = '0';
		do {
			try {
				c = (char) bufferedReader.read();
				System.out.print(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (c != 'q');

		String line = "";
		do {
			try {
				line = bufferedReader.readLine();
				System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (!line.equals("q"));

	}

}
