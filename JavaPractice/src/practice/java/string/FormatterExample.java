/**
 * 
 */
package practice.java.string;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/**
 * @author apobits@gmail.com
 *
 */
public class FormatterExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();

		try (Formatter formatter = new Formatter();
				Formatter formatter1 = new Formatter(sb);
				Formatter formatter2 = new Formatter(sb1, Locale.getDefault());
				Formatter formatter3 = new Formatter();
				Formatter formatter4 = new Formatter();
				Formatter formatter5 = new Formatter();
				Formatter formatter6 = new Formatter();
				Formatter formatter7 = new Formatter()) {

			// it has a lot of constructors that are not examined here

			Calendar calendar = Calendar.getInstance();
			calendar.set(2019, 05, 30);

			formatter.format(
					"Hello %s %c \nYour next position is Technical Lead II with a salary of %d %nTime is ticking aim to achieve this before %tF",
					"Albin", '!', 7000000, calendar);
			System.out.println(formatter);

			System.out.println(formatter1.format("Padding %07d", 1));

			// Prints a number with 5 digits long and 3 decimal places
			System.out.println(formatter2.format("Float precision %5.3f", 7.5));

			// print a string with a minimum of two and a maximum of 3
			System.out.println(formatter3.format("String precision %2.3s", "abcdefg"));

			// Justifying right, to justify left use a - symbol
			System.out.println(formatter4.format("Justifying %10.10s \nJustifying %-10.10s", "Hello", "Hello"));

			// Using space, +, 0 flags
			System.out.println(formatter5.format("%+d % f %02.2f", 7, 7.23, 7.5));

			// Using an argument index
			System.out.println(formatter6.format("%1$S %1$s", "a"));

			// Using a relative index
			System.out.println(formatter7.format("%s %<S", "a"));
			
			//Using printf
			System.out.printf("%s %<S", "a");
		}

	}

}
