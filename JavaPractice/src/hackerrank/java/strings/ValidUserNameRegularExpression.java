package hackerrank.java.strings;

import java.util.Scanner;

public class ValidUserNameRegularExpression {

    public static void main(String[] args) {
	String regex = "[a-zA-Z][a-zA-Z0-9_]{7,29}";
	try (Scanner scanner = new Scanner(System.in)) {
	    int userNameList = scanner.nextInt();
	    while (userNameList-- >= 0) {
		String userName = scanner.next();
		if (userName.matches(regex)) {
		    System.out.println("Valid");
		} else {
		    System.out.println("Invalid");
		}
	    }
	}
    }

}
