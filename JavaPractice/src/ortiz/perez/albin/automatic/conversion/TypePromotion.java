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
		byte b = 3 * 10;

		System.out.println(a * b);

		System.out.println(b);

		// automatic type promotion to int, cast to byte
		a = (byte) (a * 10);

		System.out.println(a);

		float x = 12.3f;

		float y = 123f;


	}

}
