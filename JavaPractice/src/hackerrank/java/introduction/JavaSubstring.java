package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    String word = scanner.nextLine();
	    int start = scanner.nextInt();
	    int end = scanner.nextInt();
	    System.out.println(word.substring(start, end));
	}
    }
}
