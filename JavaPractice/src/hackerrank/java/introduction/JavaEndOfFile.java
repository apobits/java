package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    for (int i = 1; scanner.hasNext(); i++) {
		System.out.println(i + " " + scanner.nextLine());
	    }
	}
    }

}
