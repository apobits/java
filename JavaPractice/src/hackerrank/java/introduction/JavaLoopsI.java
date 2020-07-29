package hackerrank.java.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaLoopsI {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int number = scanner.nextInt();
	    IntStream.range(1, 11).forEach(t -> {
		System.out.printf("%d x %d = %d%n", number, t, number * t);
	    });
	}
    }
}
