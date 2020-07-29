package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int n = scanner.nextInt();
	    for (int i = 0; i < n; i++) {
		long number;
		StringBuilder stringBuilder = new StringBuilder();
		String temp = scanner.next();
		try {
		    number = Long.parseLong(temp);
		    stringBuilder.append(number);
		} catch (NumberFormatException e) {
		    stringBuilder.append(temp + " can't be fitted anywhere.");
		    System.out.println(stringBuilder);
		    continue;
		}
		stringBuilder.append(" can be fitted in:");
		if (number >= -128 && number <= 127) {
		    stringBuilder.append("\n* byte");
		}
		if (number >= -32768 && number <= 32767) {
		    stringBuilder.append("\n* short");
		}
		if (number >= -2147483648 && number <= 2147483647) {
		    stringBuilder.append("\n* int");
		}
		stringBuilder.append("\n* long");
		System.out.println(stringBuilder);
	    }
	}
    }
}
