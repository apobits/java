/**
 * 
 */
package ortiz.perez.albin.exception;

/**
 * @author Administrador
 *
 */
public class ClassA {

	public static void divByZero() {

		int x = 2 / 0;
	}

	public static void main(String args[]) {
		here:
		try {
			ClassA.divByZero();
		} catch (Exception e) {
			 break here;
		}
	}

}
