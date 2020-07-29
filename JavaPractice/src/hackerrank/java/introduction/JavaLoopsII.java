package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    int queries = scanner.nextInt();
	    for (int i = 0; i < queries; i++) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		for (int j = 0; j < n; j++) {
		    System.out.print((a + processSeries(b, j)) + " ");
		}
		System.out.println();
	    }
	}
    }

    private static int processSeries(int b, int n) {
	int result = (int) (Math.pow(2, n) * b);
	if (n == 0) {
	    return result;
	}
	return processSeries(b, n - 1) + result;
    }
}
