/**
 * 
 */
package practice.java.control.statement;

import java.math.BigDecimal;

/**
 * @author Administrador
 *
 */
public class Switch {

	public static void switchWithStrings(String word) {
		String x = null;
		switch (word) {
		case "Hello":
			System.out.println("Hi");
			break;
		case "Bye":
			System.out.println("See you");
			System.out.println(x.charAt(0));
			break;
		}

	}

	public static void main(String[] args) {
//		try {
//			switchWithStrings("Hello");
//			switchWithStrings("Bye");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		BigDecimal bd = new BigDecimal(11111111111111111111111111111111111111111111111111d);
		System.out.println(bd);

	}

}
