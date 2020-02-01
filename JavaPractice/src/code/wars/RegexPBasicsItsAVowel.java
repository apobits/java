package code.wars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexPBasicsItsAVowel {

    public static void main(String[] args) {
	assertEquals(false,isVowel("b"));
    }

    public static boolean isVowel(String s) {
	return s.matches("[aeiouAEIOU]");
    }
}
