package hackerrank.java.introduction;

import java.util.Scanner;

public class STDINANDSTDOUT1 {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    for (int i = 0; i < 3; i++) {
		System.out.println(scanner.nextInt());
	    }
	}
    }
}
