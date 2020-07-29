package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.println("================================");
	    for (int i = 0; i < 3; i++) {
		System.out.printf("%-15s%03d%n", scanner.next(), scanner.nextInt());
	    }
	    System.out.println("================================");
	}
    }
}
