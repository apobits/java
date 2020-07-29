package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    String a = scanner.nextLine();
	    String b = scanner.nextLine();
	    System.out.println(a.length() + b.length());
	    System.out.println(a.compareTo(b) > 0?"Yes":"No");
	    System.out.println(
			    a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b
					    .substring(1));
	}
    }
}
