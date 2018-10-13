/**
 * 
 */
package practice.java.casting;

/**
 * @author apobits@gmail.com
 *
 */
public class TypeConversion {

	public static void main(String[] args) {

		byte a = 127;
		char b = 0;
		short c = 0;
		int d = 0;
		long e = 0;

		// type conversion applied
		c = a;
		d = c;
		e = d;

		System.out.println("a = " + a);
		System.out.println("b = " + (int)b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);

	}

}
