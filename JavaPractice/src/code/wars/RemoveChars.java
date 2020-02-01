package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveChars {
    public static void main(String[] args) {
	assertEquals("bc", remove("abcd"));
    }

    public static String remove(String str) {
	return str.substring(1, str.length() - 1);
    }
}
