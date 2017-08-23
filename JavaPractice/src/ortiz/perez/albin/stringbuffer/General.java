/**
 * 
 */
package ortiz.perez.albin.stringbuffer;

/**
 * @author Administrador
 *
 */
public class General {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// StringBuffer initial capacity is 16 characters +
		// length of the string stored, if the setLength() is called with a
		// lower value, the capacity does not get modified

		StringBuffer sb1 = new StringBuffer();

		StringBuffer sb2 = new StringBuffer(20);

		StringBuffer sb3 = new StringBuffer("Hello");

		System.out.println("sb1 length = " + sb1.length());
		System.out.println("sb1 capacity = " + sb1.capacity());

		System.out.println("sb2 length = " + sb2.length());
		System.out.println("sb2 capacity = " + sb2.capacity());

		System.out.println("sb3 length = " + sb3.length());
		System.out.println("sb3 capacity = " + sb3.capacity());

		sb3.setLength(3);
		System.out.println("sb3 after setLength(3) " + sb3);
		System.out.println("sb3 capacity " + sb3.capacity());

		sb3.append("12345678901234567890");
		System.out.println("sb3 after append " + sb3);

	}

}
