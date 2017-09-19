/**
 * 
 */
package ortiz.perez.albin.automatic.conversion;

/**
 * @author Administrador
 *
 */
public class TypePromotion {

	public static void main(String[] args) {

		byte a = 3;

		// automatic type promotion to int
		int b = 3 * 10;

		System.out.println(b);

		// automatic type promotion to int, cast to byte
		a = (byte) (a * 10);

		System.out.println(a);

	}

}
