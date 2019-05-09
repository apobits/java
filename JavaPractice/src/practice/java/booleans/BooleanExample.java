/**
 * 
 */
package practice.java.booleans;

/**
 * @author apobits@gmail.com
 *
 */
public class BooleanExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// boolean object created from constructor receiving a primitive value
		Boolean b = new Boolean(true);
		System.out.println("b is " + b);

		// boolean object created from constructor receiving a String literal object
		Boolean b1 = new Boolean("True");
		Boolean b2 = new Boolean("TRUE");
		Boolean b3 = new Boolean("false");
		// if String parameter is different than True not case sensitive then the new
		// object will have the value false
		Boolean b4 = new Boolean("lol");
		System.out.println("b1 is " + b1);
		System.out.println("b2 is " + b2);
		System.out.println("b3 is " + b3);
		System.out.println("b4 is " + b4);
		
		System.out.println(Boolean.valueOf("true"));

	}

}
