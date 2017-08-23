/**
 * 
 */
package ortiz.perez.albin.stringbuffer;

/**
 * @author Administrador
 *
 */
public class AppendInsertDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = sb.append(" ");
		StringBuffer sb2 = sb.append("World");// append returns the object of
												// StringBuffer

		System.out.println("sb " + sb);
		System.out.println("sb1 " + sb1);
		System.out.println("sb2 " + sb2);

		System.out.println("sb == sb1 " + (sb == sb1));
		System.out.println("sb == sb2 " + (sb == sb2));
		System.out.println("sb1 == sb2 " + (sb1 == sb2));

		StringBuffer sb3 = new StringBuffer("Java Cool");
		System.out.println(sb3.insert(5, "is "));// inserts the string at the
													// specified index

		System.out.println(sb3.reverse());// reverses the characters in the
											// StringBuffer

		System.out.println(sb3.deleteCharAt(6));// delete a character at the
												// specified index

		System.out.println(sb3.delete(0, 7));// deletes a characters from the
												// specified initIndex to
												// finishIndex

	}

}
