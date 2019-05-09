/**
 * 
 */
package practice.java.casting;

/**
 * @author apobits@gmail.com
 *
 */
public class Casting {

	public static void main(String[] args) {

		// Casting operation is ((value to be cast) / (target's type range)) obtains the
		// remainder

		byte a = 0;
		char b = 0;
		short c = 0;
		int d = 0;
		long e = 1024;

		d = (int) e;// casting long to int
		c = (short) d;// casting int to short
		b =  (char) c;// casting short to char
		a = (byte) c;// casting char to byte

		System.out.println("a = " + a);
		System.out.println("b = " + (int) b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
	}

}
