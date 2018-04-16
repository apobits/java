/**
 * 
 */
package ortiz.perez.albin.optional;

import java.util.Optional;

/**
 * @author Administrador
 *
 */
public class OptionalExample {

	public static void main(String[] args) {

		Optional<String> p = Optional.ofNullable(null);
		System.out.println(p.isPresent());

	}

}
