package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
	    String word = scanner.nextLine();
	    String[] words = word.split(" |!|,|\\?|\\.|_|'|@");
	    StringBuilder stringBuilder = new StringBuilder();
	    int j = 0;
	    for (int i = 0; i < words.length; i++) {
		if (!words[i].equals("")) {
		    stringBuilder.append(words[i]);
		    if (i + 1 < words.length) {
			stringBuilder.append("\n");
		    }
		    j++;
		}
	    }
	    System.out.println(j);
	    System.out.println(stringBuilder);
	}
    }
}
