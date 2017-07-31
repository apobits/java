/**
 * 
 */
package ortiz.perez.albin.comparison;

/**
 * @author aposo
 *
 */
public class EqualsComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "a";
		String b = "a";
		String c = new String(b);

		System.out.print("a == b ");
		System.out.println(a == b);// literals point to the same memory
									// reference

		System.out.print("a == c ");
		System.out.println(a == c);// literal and new String object points to
									// different memory references

		System.out.print("b == c ");
		System.out.println(b == c);// literal and new String object points to
									// different memory references

		System.out.print("a equals b ");
		System.out.println(a.equals(b));// String equals method is overridden to
										// compare characters inside the String
										// object

		System.out.print("a equals c ");
		System.out.println(a.equals(c));// String equals method is overridden to
										// compare characters inside the String
										// object

		System.out.print("b equals c ");
		System.out.println(b.equals(c));// String equals method is overridden to
										// compare characters inside the String
										// object
	}

}
