/**
 * 
 */
package ortiz.perez.albin.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class EmailRegex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		List<String> names = new ArrayList<>();
		while (rows != 0) {
			String name = scan.next();
			String mail = scan.next();
			if (mail.matches("^[a-z.]+@gmail.com$")) {
				names.add(name);
			}
			rows--;
		}
		Collections.sort(names, (t, u) -> t.compareTo(u));
		names.forEach(t -> System.out.println(t));
		scan.close();
	}

}
