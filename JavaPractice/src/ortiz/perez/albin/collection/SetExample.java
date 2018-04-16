/**
 * 
 */
package ortiz.perez.albin.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrador
 *
 */
public class SetExample {

	public static void main(String[] args) {

		Integer a = 1, b = 2, c = 3;

		Set<Integer> s1 = new HashSet<>();

		s1.add(a);
		s1.add(b);
		s1.add(c);
		System.out.println(s1);

	}

}
