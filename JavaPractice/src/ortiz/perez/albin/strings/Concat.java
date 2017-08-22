/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author Administrador
 *
 */
public class Concat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "Hello ";
		String b = "World";

		String c = a.concat(b);// creates a new string object

		String d = a + b;// creates a new string object, it is the same as
							// concat

		System.out.println(c == a);// objects are different

		System.out.println(d == a);// objects are different

	}

}
