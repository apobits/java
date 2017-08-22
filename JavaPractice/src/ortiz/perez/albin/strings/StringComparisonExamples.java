/**
 * 
 */
package ortiz.perez.albin.strings;

/**
 * @author Administrador
 *
 */
public class StringComparisonExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "hello";
		String b = "HELLO";
		
		System.out.println(a.equals(b));//prints false
		
		System.out.println(a.equalsIgnoreCase(b));// prints true

	}

}
