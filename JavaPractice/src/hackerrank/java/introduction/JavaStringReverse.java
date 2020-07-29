package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    String word = scanner.nextLine();
	    if (word.compareTo(new StringBuilder(word).reverse().toString()) == 0) {
		System.out.println("Yes");
	    } else {
		System.out.println("No");
	    }
	}
    }
}
