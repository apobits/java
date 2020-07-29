package hackerrank.java.introduction;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaConcurrencyFormatter {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    double amount = scanner.nextDouble();
	    NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(Locale.US);
	    System.out.println("US: " + usNumberFormat.format(amount));

	    NumberFormat indiaNumberFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN"));
	    System.out.println("India: " + indiaNumberFormat.format(amount));

	    NumberFormat chinaNumberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
	    System.out.println("China: " + chinaNumberFormat.format(amount));

	    NumberFormat franceNumberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	    System.out.println("France: " + franceNumberFormat.format(amount));
	}
    }
}
