/**
 * 
 */
package practice.java.varieties;

/**
 * @author apobits@gmail.com
 *
 */
public class MathExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(~-16);

		int a = 5;
		// unary minus -
		System.out.println("Unary minus on 5 " + -a);

		// unary plus +
		System.out.println("unary plus on -5 " + +a);

		// division with integers
		System.out.println("division with integers 4/3 " + 4 / 3);

		// division with floats
		System.out.println("division with floats 4.0/3 " + 4.0 / 3);

		// modulus operator retrieves the remainder of a division
		System.out.println("modulus of 21/5 is " + 21 % 5);

		System.out.println("modulus of 21.5/10 is " + 21.5 % 10);

		int b = 1 + 7 - 3 + 2;

		System.out.println(b);

		// it guarantees same results on different VMs
		StrictMath.sqrt(2);

		// exact methods throw an exception if an overflow happens
		// It throws an exception if an overflow happens
		Math.addExact(2000000000, 999999999);
	}

}
