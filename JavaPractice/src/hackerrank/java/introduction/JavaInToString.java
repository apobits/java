package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaInToString {
    public static void main(String[] args) {
	int n;
	try (Scanner scanner = new Scanner(System.in)) {
	    n = scanner.nextInt();
	}
	String s = String.valueOf(n);
	if (n == Integer.parseInt(s)) {
	    System.out.println("Good job");
	} else {
	    System.out.println("Wrong answer.");
	}
    }
}
