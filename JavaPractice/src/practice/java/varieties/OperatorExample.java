/**
 * 
 */
package practice.java.varieties;

/**
 * @author aposo
 *
 */
public class OperatorExample {

	public static void relationOperators() {
		System.out.println("1 equals 1 " + (1 == 1));
		System.out.println("1 not equals 1 " + (1 != 1));
		System.out.println("1 greater than 1 " + (1 > 1));
		System.out.println("1 less than 1 " + (1 < 1));
		System.out.println("1 greater than or equals to " + (1 >= 1));
		System.out.println("1 less than or equals to " + (1 <= 1));
	}

	public static void conditionalOperators() {
		System.out.println("Shortcircuit operators");
		System.out.println("true && true " + (true && true));
		System.out.println("true||false " + (true || false));
	}

	public static void typeComparisonOperator() {
		var x = Integer.valueOf(1);
		System.out.println(x instanceof Integer);
	}

	public static void main(String[] args) {

	}

}
