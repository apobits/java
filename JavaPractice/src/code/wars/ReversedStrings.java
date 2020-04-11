package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedStrings {

    public static void main(String[] args) {
	assertEquals("abc", solution("cba"));
    }

    public static String solution(String str) {
	StringBuilder sb = new StringBuilder();
	for (int i = str.length() - 1; i >= 0; i--) {
	    sb.append(str.charAt(i));
	}
	return sb.toString();
    }
}
