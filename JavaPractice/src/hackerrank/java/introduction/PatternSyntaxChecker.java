package hackerrank.java.introduction;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int testCases = scanner.nextInt();
	    scanner.nextLine();
	    for (int i = 0; i < testCases; i++) {
		try {
		    Pattern.compile(scanner.nextLine());
		    System.out.println("Valid");
		} catch (PatternSyntaxException e) {
		    System.out.println("Invalid");
		}
	    }
	}
    }
}
