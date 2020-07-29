package hackerrank.java.introduction;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int value = scanner.nextInt();
	    if (value % 2 != 0) {
		System.out.println("Weird");
		return;
	    }
	    if ((value >= 2 && value <= 5) || value > 20) {
		System.out.println("Not Weird");
	    } else {
		System.out.println("Weird");
	    }
	}
    }
}
