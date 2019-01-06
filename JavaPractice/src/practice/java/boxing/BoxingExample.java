/**
 * 
 */
package practice.java.boxing;

/**
 * @author aposo
 *
 */
public class BoxingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// auto boxing
		Integer a = 4;

		// manual boxing through constructors
		Integer d = new Integer(3);

		// manual unboxing
		int b = a.intValue();

		// auto unboxing
		int c = a;

	}

}
