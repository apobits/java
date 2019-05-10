/**
 * 
 */
package practice.java.number;

/**
 * @author apobits@gmail.com
 *
 */
public class DoubleExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Double d = new Double(3.141516);
		Double dd = new Double("3141516E-6");
		Double infinity = new Double(1 / 0.);
		Double nan = new Double(0 / 0.);

		System.out.println(infinity);
		System.out.println(nan);

		System.out.println(d.equals(dd));

		System.out.println(Double.NaN);
		System.out.println(Double.BYTES);
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_NORMAL);
		System.out.println(Double.SIZE);
		System.out.println(d.isInfinite() + " " + d.isNaN());

		System.out.println("Producing a positive infinity " + 1.0 / 0.0);
		System.out.println("Producing a negative infinity " + -1.0 / 0.0);
		System.out.println("Producing a NaN " + 0.0 / 0.0);

	}

}
