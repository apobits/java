/**
 * 
 */
package ortiz.perez.albin.literal;

/**
 * @author Administrator
 *
 */
public class IntegerLiteral {

	public static void main(String[] args) {

		// Decimal(base 10) literal value
		int dOne = 1, dTwo = 2, dThree = 3;
		System.out.println(dOne + " " + dTwo + " " + dThree);

		// Octal(base 8) literal value
		int oX = 07421;
		System.out.println(oX);

		// int oY = 0821; out of range error

		// Hexadecimal(base 16) literal value
		int hX = 0x8fff;
		System.out.println(hX);

		// integer literal using binary
		int bX = 0b1010;
		System.out.println(bX);

		// integer literals with underscores
		long a = 314_123_45_67l;
		System.out.println(a);

		// integer literals with underscores
		long b = 0x7ff_fL;
		System.out.println(b);

		// integer literals using binary and underscores
		int x = 0b1101_0101_0001_1010;
		System.out.println(x);

	}

}
