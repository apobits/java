package code.wars;

import org.junit.jupiter.api.Assertions;

public class AlternateCapitalization {
    public static void main(String[] args) {
	Assertions.assertArrayEquals(new String[] { "AlBiN", "aLbIn" }, capitalize("albin"));
    }

    public static String[] capitalize(String s) {
	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
	for (int i = 0; i < s.length(); i++) {
	    if (i % 2 == 0) {
		process(sb1, s.substring(i, i + 1), true);
		process(sb2, s.substring(i, i + 1), false);
	    } else {
		process(sb1, s.substring(i, i + 1), false);
		process(sb2, s.substring(i, i + 1), true);
	    }
	}
	return new String[] { sb1.toString(), sb2.toString() };
    }

    private static void process(StringBuilder sb, String letter, boolean upperCase) {
	if (upperCase) {
	    sb.append(letter.toUpperCase());
	} else {
	    sb.append(letter.toLowerCase());
	}
    }

}
