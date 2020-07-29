package hackerrank.java.introduction;

import java.util.Scanner;

public class STDINANDSTDOUT2 {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int intVal = scanner.nextInt();
	    double doubleVal = scanner.nextDouble();
	    scanner.nextLine();
	    String stringVal = scanner.nextLine();
	    System.out.println("String: " + stringVal);
	    System.out.println("Double: " + doubleVal);
	    System.out.println("Int: " + intVal);
	}
    }
}
