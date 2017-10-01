/**
 * 
 */
package ortiz.perez.albin.automatic.conversion;

/**
 * @author Administrador
 *
 */
public class CastingExample {

	public static void main(String[] args) {

		int a = 127;
		//narrowing conversion
		byte b = (byte) a;

		System.out.println(b);
		
		float c = 10.9f;
		
		//truncation
		short d = (short) c;
		
		System.out.println(d);
		
		//reduce modulo
		byte e = (byte) 257;
		System.out.println(e);
	}

}
