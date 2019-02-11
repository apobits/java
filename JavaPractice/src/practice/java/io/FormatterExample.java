/**
 * 
 */
package practice.java.io;

import java.util.Formatter;

/**
 * @author apobits@gmail.com
 *
 */
public class FormatterExample {

	public static void formatter() {

		try (Formatter formatter = new Formatter()) {
			System.out.print(formatter.format("Hello %s your new monthly salary is $%d USD %n", "Albin", 10000));
		}
	}

	public static void string() {

		System.out.print(String.format("Hello %s your new monthly salary is $%d USD %n", "Albin", 10000));
	}

	public static void printf() {
		System.out.printf("Hello %s your new monthly salary is $%d USD %n", "Albin", 10000);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		formatter();
		string();
		printf();
	}

}
