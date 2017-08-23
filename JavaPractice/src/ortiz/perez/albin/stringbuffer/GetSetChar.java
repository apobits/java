/**
 * 
 */
package ortiz.perez.albin.stringbuffer;

/**
 * @author Administrador
 *
 */
public class GetSetChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println(sb.charAt(0));// get the char at the specified index

		sb.setCharAt(0, 'h');// sets the char at the specified index

		System.out.println(sb);

		char[] x = new char[10];

		sb.getChars(0, sb.length(), x, 0);// passes the characteres of the
											// string buffer to a char array

		System.out.println(x);

	}

}
