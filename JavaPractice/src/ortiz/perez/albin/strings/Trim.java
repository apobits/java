/**
 * 
 */
package ortiz.perez.albin.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Administrador
 *
 */
public class Trim {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = null;
		while(!(x=br.readLine()).equalsIgnoreCase("exit")){
			System.out.println("Original input " + x);
			System.out.println("Leading and trailing spaces removed " + x.trim());
		}

	}

}
