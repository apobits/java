/**
 * 
 */
package ortiz.perez.albin.strings;

import ortiz.perez.albin.object.A;

/**
 * @author Administrador
 *
 */
public class StringExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	char[] a = { 104, 105 };
	String s = new String(a);// String created from an array of chars
	System.out.println(s);

	char[] b = { 'h', 'e', 'l', 'l', 'o' };
	s = new String(b);// String created from an array of chars
	System.out.println(s);

	s = new String(b, 2, 2);// String created from an array of chars with a
				// star position and quantity to include
	System.out.println(s);

	String t = new String(s);// String created from another string
	System.out.println(t);

	byte[] c = { 104, 105 };
	String u = new String(c);// String created from an array of bytes
	System.out.println(u);

	System.out.println(u.length());// returns the length of the string

	System.out.println("A" + 2 + 2);// it prints A22
	System.out.println("A" + (2 + 2));// it prints A4

	System.out.println(new A());// the toString() method is invoked when objects are used in print, println and concatenation expressions
	System.out.println("toString() " + new A());//concatenation expression

    }

}
